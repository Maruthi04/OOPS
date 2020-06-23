class hiding{
	private int height;
	public void setHeight(int height) {
		this.height=height;
		System.out.println("the setting is done");
	}
	public void getHeight() {
		System.out.println("the height of the student is "+this.height);
	}
	public void BMICalculation() {
		int a=5;
		int b=6;
		System.out.println("the calculation is done "+(this.height*a*b));
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hiding h=new hiding();
		h.setHeight(55);
		h.getHeight();
		h.BMICalculation();
		//https://www.javatpoint.com/encapsulation
		/** <h1>hello evryone </h1> */
	}

}
