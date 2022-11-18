package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListStoreInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		
		values.add(33);
		values.add(44);
		values.add(55);
		values.add(66);
		values.add(77);
		values.add(88);

		//Remove second element from list using index
		values.remove(1);
		for(Integer value:values)
		{
			System.out.println(value);
		}
		//Remove second element from list using value
		values.remove("55");
		for(Integer value:values)
		{
			System.out.println(value);
		}
		//Add 90 at index 3
		values.add(3,90);
		
		for(Integer value:values)
		{
			System.out.println(value);
		}
		//Get the length of list
		System.out.println("length of list"+values.size());
		//Print all values from list using any values
		for(Integer value:values)
		{
			System.out.println(value);
		}
		//Convert List into array.
		
		Object[] array = values.toArray();
		
		
		
	}

}
