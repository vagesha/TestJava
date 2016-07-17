
public class Derived1 extends Base1{

	public Derived1(){
		System.out.println("Derived Const");
	}
	
	public int fun(String s, int n) {
		
		return n+1;
	}
	
	public int fun(int n, String s) {
		
		return n+2;
	}
}
