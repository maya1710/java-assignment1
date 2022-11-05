package Assignment1;

public class BreakString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String [] arr = new String[5];
		
		arr[0] = "Java";
		arr[1] = "Javascript";
		arr[2] = "Selenium";
		arr[3] = "Python";
		arr[4] = "Mukesh";
		for(int i=0;i<5;i++)
		{
		 if (arr[i]== "Selenium" )
		 
			 break;
		 System.out.println(" before breaking execution-"+arr[i]);
		}
		//System.out.println("arr[i]");

	}

}
