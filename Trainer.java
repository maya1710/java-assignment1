package Assignment2;

public class Trainer {

	
	String name;
	String email;
	String department;
	int id;
	public Trainer(String traName,String emailID,String traDepartment,int traID)
	{
	
		name= traName;
		email =emailID;
		department=traDepartment;
		id=traID;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Trainer tra1= new Trainer("Mukesh","mukesh@gmail.com","Selenium",1);
     Trainer tra2= new Trainer("Hitesh","hiteshsh@gmail.com","DevOps",2);
     Trainer tra3= new Trainer("Rakesh","rakesh@gmail.com","WebDevelopment",3);
     
   
   System.out.println(tra1.department+" " +tra1.email +""+tra1.id+" " +tra1.name);
   System.out.println(tra2.department +" "+tra2.email+" " +tra2.id  +" "+tra2.name);
   System.out.println(tra3.department+" " +tra3.email+" " +tra3.id+" " +tra3.name);
   
	}    
}
