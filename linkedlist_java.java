import java.util.*;
public class linkedlist_java {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<5;i+=1) {
			int temp=(int)Math.pow(i, 2);
			ll.add(temp);
		}
		for(int i:ll) {
			System.out.println(i);
		}
		//or you can directly print all the elements at once by 
		System.out.println(ll);
		//add first 
		ll.addFirst(4);
		ll.addLast(10);
		System.out.println("After the insertions");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After the deletions");
		System.out.println(ll);
		//you can also get the first element by
		System.out.println("the first element is "+ll.getFirst());
		System.out.println("the last element is "+ll.getLast());
	}

}
