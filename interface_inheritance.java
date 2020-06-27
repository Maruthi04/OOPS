import java.util.*;
interface onee{
	void name();
}
interface two{
	void addr();
}
interface three{
	void phone();
}
interface five{
	void extra();
}
interface four extends onee,two,three,five{
	//an interface can extend any number of interfaces
	void rollno();
}
class imple implements four{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Enter the name");
	}

	@Override
	public void addr() {
		// TODO Auto-generated method stub
		System.out.println("Enter the addr");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("Enter the phone");
	}

	@Override
	public void rollno() {
		// TODO Auto-generated method stub
		System.out.println("enter the roll number");
	}

	@Override
	public void extra() {
		// TODO Auto-generated method stub
		System.out.println("this was added by me for checking hehehe");
	}
	
}
public class interface_inheritance {
	public static void main(String args[]) {
		imple obj=new imple();
		obj.name();
		obj.addr();
		obj.phone();
		obj.rollno();
	}
}
