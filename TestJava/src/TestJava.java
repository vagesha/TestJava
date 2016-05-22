
public class TestJava {

	public void testDerived() {
		Base1 b = new Base1();
		
		b.basePrint();
	}
	
	public static void main(String[] args) {

		TestJava tj = new TestJava();
		tj.testDerived();
	}

}
