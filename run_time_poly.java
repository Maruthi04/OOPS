class one{
	void func() {
		System.out.println("i am the parent");
	}
}
public class run_time_poly extends one{

	public void func() {
		System.out.println("i am in child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one obj;
		obj=new one();
		obj.func();
		obj=new run_time_poly();
		obj.func();

	}

}
