import java.util.*;
public class hashmap_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> dic=new HashMap<Integer,Integer>();
		for(int i=0;i<5;i+=1) {
			int x=(int)Math.pow(i, 2);
			dic.put(i,x);
		}
		System.out.println(dic);
		//you can access the element with the key by
		System.out.println(dic.get(3));
		//find out the dic size bt size()
		System.out.println("the size of the hashmap is "+dic.size());
		//you can remove the key from the hashmap by remove()
		System.out.println("the element at 4th key is "+dic.remove(4));
		//if you only want the keys friom the hashmap then 
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		
	}

}
