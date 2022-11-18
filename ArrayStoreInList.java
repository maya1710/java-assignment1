package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class ArrayStoreInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int [] number = {12,67,98,180,275};
		  
		  List<Integer> values = new ArrayList<>();
		  
	//System.out.println("store values in Arralist from Array");	  
  for(int i = 0; i<number.length;i++)	
  {
	//values.add(null)
	  
	 
	  values.add(number[i]);

	}
  
  System.out.println("print values from Arraylist");
  for(int i = 0; i<values.size();i++)	
  {
	//values.add(null)	  
	 
	System.out.println(values.get(i));

	}

}
}
