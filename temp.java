// Extend BoxWeight to include shipping costs.
// Start with Box.
class Box {
	static void func() {
		System.out.println("i am normal version");
	}
	static void func(int n) {
		System.out.println("i am the hybrid version "+n);
	}
}


class temp {
	public static void main(String args[]) {
		Box.func();
		Box.func(4);
	}
}