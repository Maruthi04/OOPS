interface one11{
	default void method() {
		System.out.println("Hey i am defined here");
	}
	void define();
}
interface two22{
	static void method() {
		System.out.println("Hey i am two interface's method");
	}
	void define();
}

public class runtime_poly_int implements one11,two22{
	public void define() {
		System.out.println("hey");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runtime_poly_int obj=new runtime_poly_int();
		obj.method();
		two22.method();
		
		
	}

}
