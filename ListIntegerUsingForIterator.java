package Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntegerUsingForIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		
		values.add(12);
		values.add(15);
		values.add(20);
		values.add(49);
		values.add(56);
		
    Iterator<Integer> itr = values.iterator();
		
		while(itr.hasNext())
		{
			Integer value =itr.next();
			System.out.println(value);
		
		}
	}

}
