
public class compile_time_poly {
	public void func(int a) {
		System.out.println(a++);
	}
	public void func(int a,int b) {
		a++;
		b++;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compile_time_poly obj=new compile_time_poly();
		obj.func(4);
		obj.func(4,5);
	}

}
