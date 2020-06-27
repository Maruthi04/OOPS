
public class finalize_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalize_usage fin=new finalize_usage();
		fin=null;
System.gc();
	}
	public void finalize(){
		System.out.println("yeah this gc is called");
	}

}
