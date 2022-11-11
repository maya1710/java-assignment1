package Assignment2;

public class Trainer2 {

	
	String name;
	String email;
	String department;
	int id;
	public Trainer2(String traName,String emailID,String traDepartment,int traID)
	{
	
		name= traName;
		email =emailID;
		department=traDepartment;
		id=traID;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Trainer2 tra1= new Trainer2("Mukesh","mukesh@gmail.com","Selenium",1);
     Trainer2 tra2= new Trainer2("Hitesh","hiteshsh@gmail.com","DevOps",2);
     Trainer2 tra3= new Trainer2("Rakesh","rakesh@gmail.com","WebDevelopment",3);
    
   
   Object [][] details = new Object [3][4];
   details[0][0] =tra1.department;
   details[0][1] =tra1.email;
   details[0][2] =tra1.name;
   details[0][3] =tra1.id;
   details[1][0] =tra2.department;
   details[1][1] =tra2.email;
   details[1][2] =tra2.name;
   details[1][3] =tra2.id;
   details[2][0] =tra3.department;
   details[2][1] =tra3.email;
   details[2][2] =tra3.name;
   details[2][3] =tra3.id;
   
   
   System.out.println(details[0][0] +" "+details[0][1]+" "+details[0][2]+" "+details[0][3]);
   System.out.println(details[1][0] +" "+details[1][1]+" "+details[1][2]+" "+details[1][3]);
   System.out.println(details[2][0] +" "+details[2][1]+" "+details[2][2]+" "+details[2][3]);
	}    
}
