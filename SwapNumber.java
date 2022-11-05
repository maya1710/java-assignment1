package Assignment1;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Start");
		
		int a =20;
		int b= 10;
		
		System.out.println("a is before swapping "+a);
		System.out.println("b is before swapping "+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("a is now "+a);
		System.out.println("b is now "+b);


}
}
