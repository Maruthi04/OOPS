import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> dic=new HashSet<>();
		dic.add(1);
		dic.add(2);
		dic.add(3);
		dic.add(4);
		dic.add(5);
		dic.add(6);
		System.out.println(dic);
		if(dic.contains(-1)) {
			System.out.println("the wanted element is found here");
		}
		else {
			System.out.println("the wanted element is not found here");
			System.out.println("and this method also returned "+dic.contains(-1));
		}
		System.out.println("the size of the hashset is "+dic.size());
		dic.remove(4);
		System.out.println("the hashset afte removing the entry with key 4 is "+dic);
	}

}
