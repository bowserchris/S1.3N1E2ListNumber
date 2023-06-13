package n1e2ejercicio2Lists;
import java.util.*;

import n1e1ejericioMonth.Month;	

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println("First list: " + list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		Collections.reverse(list1.subList(0, list1.size()));	//reverse first time
		list2.addAll(list1);
		
		System.out.println("Second list after reverse order: " + list2);
		
		Collections.reverse(list1.subList(0, list1.size()));	//return list to original way
		
		for (ListIterator<Integer> it = list1.listIterator(); it.hasNext(); ) {	
			list2.add(it.next());
			//it.remove();
		}
		
		System.out.println("Using the Listiterator to add list again: " + list2);
	}

}

/*
 * 
 * - Exercise 2

Create and populate a List<Integer>.

Create a second List<Integer> and insert the elements of the first list into the second list in reverse order.

Use the ListIterator objects to read the elements of the first list and insert them into the second.
*/
