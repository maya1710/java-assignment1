package Assignment2;


import java.util.Scanner;

public class Student {

	
	String name;
	String email;
	long phone;
	String address;
	String status;
	public Student (String Name,String emailID,long Phone, String Address,String  Status)
	{
	
		name= Name;
		email =emailID;
		phone=Phone;
		address=Address;
		status=Status;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("how many student info you want to store");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
    
   System.out.println("num is "+num);
   Object [][] details = new Object [num][5];
   
	for(int i=0 ;i<=num; i++) {	
	System.out.println("Enter student name");		
   details[i][0] =scan.next();
   System.out.println("Enter student email");	
   details[i][1] =scan.next();
   System.out.println("Enter student phone");	
   details[i][2] =scan.next();
   System.out.println("Enter student address");	
   details[i][3] =scan.next();
   System.out.println("Enter student status");	
   details[i][4]=scan.next();

	}
 /*  
   System.out.println(details[0][0] +" "+details[0][1]+" "+details[0][2]+" "+details[0][3]);
   System.out.println(details[1][0] +" "+details[1][1]+" "+details[1][2]+" "+details[1][3]);
   System.out.println(details[2][0] +" "+details[2][1]+" "+details[2][2]+" "+details[2][3]);
   */
	}    
}

