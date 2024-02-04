package handlers.JAssignStmt;

import es.Escape;
import es.EscapeStatus;
import handlers.JInvokeStmtHandler;
import ptg.*;
import soot.Local;
import soot.PrimType;
import soot.Unit;
import soot.Value;
import soot.jimple.*;
import soot.jimple.internal.JArrayRef;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JCastExpr;
import utils.AnalysisError;

import java.util.Map;

public class JAssignStmtHandler {
	public static void handle(Unit u, PointsToGraph ptg, Map<ObjectNode, EscapeStatus> summary) {
		{
			/*
			 * JAssignStmt Example:
			 * $r2 = new java.lang.String
			 */
			JAssignStmt stmt = (JAssignStmt) u;
			Value lhs = stmt.getLeftOp();
			Value rhs = stmt.getRightOp();
			if (lhs.getType() instanceof PrimType) {
				if (rhs instanceof InvokeExpr) {
					JInvokeStmtHandler.handleExpr(u,(InvokeExpr) rhs, ptg, summary);
				}
				return;
			} else if (lhs instanceof Local) {
				// System.err.println(lhs+" is Local");
				lhsIsLocal(rhs, u, ptg, summary);
			} else if (lhs instanceof Ref) {
				// System.err.println(lhs+" is Ref");
				StoreStmt.handle(u, ptg, summary);
			} else {
				AnalysisError.unidentifiedAssignStmtCase(u);
			}
		}
	}

	private static void lhsIsLocal(Value rhs, Unit u, PointsToGraph ptg, Map<ObjectNode, EscapeStatus> summary) {
		// System.err.println(u+" "+rhs.getType());
		if (rhs instanceof AnyNewExpr) {
			NewStmt.handle(u, ptg, summary);
		} else if (rhs instanceof NullConstant) {
			EraseStmt.handle(u, ptg, summary);
		} else if(rhs instanceof Local || rhs instanceof JCastExpr) {
			CopyStmt.handle(u, ptg, summary);
		} else if (rhs instanceof FieldRef || rhs instanceof JArrayRef) {
			LoadStmt.handle(u, ptg, summary);
		} else if (rhs instanceof InvokeExpr) {
			InvokeStmt.handle(u, ptg, summary);
		} else if (rhs instanceof StringConstant || rhs instanceof ClassConstant) {
			storeConstantToLocal(u, ptg, summary);
		} else AnalysisError.unidentifiedAssignStmtCase(u);
	}

	private static void storeConstantToLocal(Unit u, PointsToGraph ptg, Map<ObjectNode, EscapeStatus> summary) {
		// TODO: ObjectFactory no longer has responsibility to figure out ObjectType
		ObjectNode obj = ObjectFactory.getObj(u);
		if (obj.type != ObjectType.internal) {
			throw new IllegalArgumentException("Object received from factory is not of required type: internal");
		}
		Local lhs = (Local) ((JAssignStmt) u).getLeftOp();
		ptg.addVar(lhs, obj);
		EscapeStatus es = new EscapeStatus(Escape.getInstance());
		if (obj instanceof InvalidBCIObjectNode) es.setEscape();
		summary.put(obj, es);
	}

}
