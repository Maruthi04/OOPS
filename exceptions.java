import java.util.*;
public class exceptions {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);//this is a arithmetic exception
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("this divide by zero is caught by me!!!");
		}
		try {
			String s=null;
			System.out.println(s.length());//this is a arithmetic exception
			
			
		}
		catch(NullPointerException e) {
			
			System.out.println("this null is caught by me!!!");
		}
		try {
			int arr[]=new int[5];
			System.out.println(arr[6]);//ArrayIndexOutfBoundsException
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
	
			System.out.println("this array is caught bt me");
		}
		try {
			
			int a=Integer.parseInt("ABD");
			System.out.println(a);//NumberFormatException
		}
		catch(NumberFormatException e) {
			System.out.println("this number format exception is caught by me!!");
		}
		
		finally {
			System.out.println("finally 1");
		}
	}

}
