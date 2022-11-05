package Assignment1;

public class Sumof5Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] arr = new double[5];
		
		arr[0] = 10;
		arr[1] = 96.78;
		arr[2] = 111;
		arr[3]= 8989;
		arr[4]=7876;
		
		double sum =0;
		
		for(int i=0;i<5;i++)
		{
			
			sum=sum+arr[i];
		}
		
		System.out.println("sum is"+sum);
		
		
		

		
		

	}

}
