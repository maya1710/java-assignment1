package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class SumOfIntegersStoredInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		int sum =0;
		values.add(12);
		values.add(15);
		values.add(20);
		values.add(49);
		values.add(56);
		for( int i=0; i<values.size();i++)
		{
			sum = sum + values.get(i);
		}
		
		System.out.println("Sum of the integers " + sum);
		
		
	}

}
