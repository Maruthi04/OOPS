import java.util.*;
class st{
	int a=4;
	static int c=6;
	void metod() {
		System.out.println("hello");
	}
	static int mine() {
		st s=new st();
		s.metod();
		return 1;
	}
}
class temp{
	
	public static void main(String args[]) {
		int i=0;
		
		char c=65;
		System.out.printf("%c\n",c);
		st.mine();
		
}
}

