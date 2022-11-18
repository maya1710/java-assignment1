package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListIntegerUsingForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		
		values.add(12);
		values.add(15);
		values.add(20);
		values.add(49);
		values.add(56);
		for(Integer value:values)
		{
			System.out.println(value);
		}
		
		
		
	}

}
