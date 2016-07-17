
public class TestJava {

	public void testDerived() {
		//Base1 b = new Base1();
		Base1 d = new Derived1();
		//b.basePrint();
		Derived1 d1 = new Derived1();
		int i = d.fun("test", 1);
		System.out.println(i);
		i=d1.fun(1, "test");
		System.out.println(i);
		i=d.fun(1);
		System.out.println(i);
		i=d1.fun(1);
		System.out.println(i);

	}
	
	public static void main(String[] args) {

		TestJava tj = new TestJava();
		tj.testDerived();
	}

}
