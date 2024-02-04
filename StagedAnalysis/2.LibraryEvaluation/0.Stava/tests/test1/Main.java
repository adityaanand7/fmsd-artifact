public class Main {
	static A global;
	int f;
	public static void main(String[] args) {
		A a =  new A();
		A a1 = new A();
		A a2 = new A();
		a.bar(a1,a2);
		a.foo(a1,a2);
		a.fb();
	}
	void fb(){
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		a3.bar(a4,a5);
	}
}
class A extends Main {
	void bar(A p5, A p6){
		global = p5;
	}
	void foo( A p7, A p8){
		global = p8;
	}
}
