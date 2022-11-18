package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String>automation=Arrays.asList("Web Automation", "API Automation", "Mobile Automation");
	
	//display true if list contains Mobile else prints false
	System.out.println(automation.contains("Mobile Automation"));
	
	//display false
	System.out.println(automation.contains("Manual"));

}
}
