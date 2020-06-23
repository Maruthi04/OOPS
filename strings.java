import java.util.*;
public class strings {
	public static void main(String args[]) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("the entered String value is "+s);
		String temp1=s.toUpperCase();
		String temp2=s.toLowerCase();
		System.out.println("The lower case is "+temp1);
		System.out.println("the upper case is "+temp2);
		int k=s.indexOf("srinivas");
		System.out.println("the index of seinivas in string is "+k);
		System.out.println("the length of the string is "+s.length());
		String temp="Maruthi srinivas";
		int arr[]= {1,2,3};
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println(arr);
		char[] temp11=temp.toCharArray();
		System.out.println(temp11.length);
		for(char ch:temp11) {
			System.out.println(ch);
		}
		
	}
}
