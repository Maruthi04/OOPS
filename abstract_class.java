abstract class university{
	abstract void fee();
	abstract void sports_fac();
	abstract void faculty();

}
class amrita extends university{
	int _v;
	@Override
	void fee() {
		// TODO Auto-generated method stub
		System.out.println("5600005");
	}

	@Override
	void sports_fac() {
		// TODO Auto-generated method stub
		System.out.println("good");
	}

	@Override
	void faculty() {
		// TODO Auto-generated method stub
		System.out.println("worst");
	}
	
}
class vit extends university{

	@Override
	void fee() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	void sports_fac() {
		// TODO Auto-generated method stub
		System.out.println("supeer");
	}

	@Override
	void faculty() {
		// TODO Auto-generated method stub
		System.out.println("keka");
	}
	
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amrita a=new amrita();
		vit v=new vit();
		a.fee();
		a.faculty();
		a.sports_fac();
		v.fee();
		v.faculty();
		v.sports_fac();
	}

}
