import java.util.*;
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		short b;
		long c;
		byte d;
		double dd;
		float f;
		char ch;
		boolean boo=true;
		String s;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextShort();
		c=sc.nextLong();
		d=sc.nextByte();
		dd=sc.nextDouble();
		f=sc.nextFloat();
		ch=sc.next().charAt(0);
		s=sc.nextLine();
		a=b;//even this wont cause the error!!
		System.out.println("The integer is "+a);
		System.out.println("The short int  is "+b);
		System.out.println("The Long int is "+c);
		System.out.println("The byte is "+d);
		System.out.println("The Double is "+dd);
		System.out.println("The char is "+ch);
		System.out.println("The float is "+f);
		System.out.println("The boolean value is "+boo);
		sc.close();
	}

}
