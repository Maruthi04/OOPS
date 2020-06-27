class myexcep extends Exception{
	myexcep(String s){
		super(s);
	}
}
public class custom_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new myexcep("Hello this is exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
