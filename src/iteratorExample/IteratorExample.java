package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	/*
	 * Iterators works like a cursor or a for loop.
	 * They only work with a Collection (List, HashMap or HashSet)
	 * 
	 * There are two types of Iterators: normal and list iterator.
	 * The main difference between them is that list can walk into the collection to both directions.
	 * 
	 * */
	public void iterator() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
		list.add("Z");
		
		Iterator iterator = list.iterator();
		
		System.out.println("List elements:");
		
		while(iterator.hasNext())
			System.out.print(iterator.next()+ " ");
	
		System.out.println();
	}
	
	public void listIterator() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("X");
		list.add("Y");
		list.add("Z");
		
		ListIterator listIterator = list.listIterator();
		
		System.out.println("Displaying list elements in forward direction: ");
		while(listIterator.hasNext())
			System.out.print(listIterator.next()+ " ");
		
		System.out.println();
		
		System.out.println("Displaying list elements in backward direction: ");
		while(listIterator.hasPrevious())
			System.out.print(listIterator.previous()+ " ");
	}
}
