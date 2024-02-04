class Main {
	C f = new C();
	public static void main(String args[]) {
		Main a = new Main();
		Main b = new Main();
		Main c = new Main();
		a.foo(b);
		b.bar(c);
		
	}
	
	void foo(Main p1) {
		B c = new B();
		B d = new B();
		B e = new B();
		c.bar(d);
		//C ctemp = p1.f;
		//C ctemp2 = ctemp.g;
		C f = new C();
		int g;
		g = f.bar(f); 
	}
	
	int bar(Main p2) {
		return 10;
	}	
}

class B extends Main {
	int bar (B p3) {
		B btemp = new B();
		btemp = p3;
		return 20;
	}
}

class C extends Main {
	C g;
	int bar (C p4) {
		return 100;
	}
}
