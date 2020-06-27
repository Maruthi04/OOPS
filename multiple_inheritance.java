interface amrita1{
	void anokha();
	void students();
}
interface vit1{
	void somefunction();
	void students();
}
public class multiple_inheritance implements amrita1,vit1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple_inheritance obj=new multiple_inheritance();
		obj.anokha();
		obj.somefunction();
		obj.students();//see here eventhough the two int's are having
						//the same method the class is imlementing the function only
						//once so there will be no ambiguity
		
	}

	@Override
	public void somefunction() {
		// TODO Auto-generated method stub
		System.out.println("Vit does this very greately");
	}

	@Override
	public void anokha() {
		// TODO Auto-generated method stub
		System.out.println("amrita conducts anokha every year");
	}

	@Override
	public void students() {
		// TODO Auto-generated method stub
		System.out.println("The students who are talented and creative can do all the stuff");
		
	}

}
