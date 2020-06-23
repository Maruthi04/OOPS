abstract class car{
	
	abstract void usage();
	
	public  void repair() {
		System.out.println("Please Restart");
	}
	
	public void contact() {
		System.out.println("contact us @ 9141516333");
	}
}
class implement extends car{

	@Override
	void usage() {
		// TODO Auto-generated method stub
		System.out.println("hey i am using the car!!");
	}
	
}
public class abstraction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implement i=new implement();
		i.usage();
		i.contact();
		i.repair();
	}
	//https://www.w3schools.com/java/java_abstract.asp
	

}
