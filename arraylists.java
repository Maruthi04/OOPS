import java.util.*;
public class arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			int k=(int)Math.pow(i,2);
			arr.add(k);
		}
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		//this way you can also print the elements by index
		int x=arr.get(0);
		System.out.println(x);
		//you can also find the index of any element in the array list
		System.out.println(arr.indexOf(4));
		System.out.println(arr.indexOf(-1));
		//you can also sort the arraylist by sort
		Collections.sort(arr);
		System.out.println(arr);
		//you can also set the specific value at index;
		arr.set(0,99);
		System.out.println(arr);
		//this set replaces the value at current index
	}

}
