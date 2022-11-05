package Assignment1;

public class PrintMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 96;
		arr[2] = 56;
		arr[3] = 89;
		arr[4] = 78;
		
		for(int i=0;i<5;i++)
		{
			if (arr[i]>80)
			{
			System.out.println("marks " +arr[i]);
			}
			
		}
		
        
	}

}
