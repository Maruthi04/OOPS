class a{
	int myf() {
		return 11;
	}
}
public class cloneable_interface implements Cloneable{
	protected Object clone() 
		    throws CloneNotSupportedException 
		    { 
		        return super.clone(); 
		    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj=new a();
//		a obj2=(a) a.clone();
		System.out.println(obj.myf());
	}

}
