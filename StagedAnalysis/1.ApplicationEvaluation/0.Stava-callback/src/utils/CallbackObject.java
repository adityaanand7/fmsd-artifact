package utils;

import ptg.ObjectNode;
import soot.SootMethod;

public class CallbackObject {

    public SootMethod sm;
    public ObjectNode ob;

    public CallbackObject(SootMethod s, ObjectNode o) {
        this.sm = s;
        this.ob = o;
    }
    public String toString() {
        return  "<"+ this.sm + ", "+ this.ob.toString() + ">";
    }

    public boolean equals(CallbackObject o) {
        return this.sm.hashCode() == o.sm.hashCode() && this.ob.hashcode == o.ob.hashcode;
    }


}
