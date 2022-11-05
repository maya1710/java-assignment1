package Assignment1;

public class Primenumbers {

	public static void main(String[] args) {
		 int i, j, isPrime;
	        System.out.println("Prime Numbers Between 1 to 1000");
	 
	   
	        for (i = 2; i <= 1000; i++) {
	            isPrime = 0;
	
	            for (j = 2; j <= i / 2; j++) {
	                        if (i % j == 0) {
	                    isPrime = 1;
	                    break;
	                }
	            }
	 
	            if (isPrime == 0)
	                System.out.print(i + " ");
	        }
	  
}
}
