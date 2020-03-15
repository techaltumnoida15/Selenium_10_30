package javaP;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ListEx {

	@Test
	public void listExample() {
		//System.out.println("Hi");
		
		//List declare
		List<String> myL = new ArrayList<String>();   //bydefault size = 10
		//Ordered collection
		
		myL.add("A");
		myL.add("B");
		myL.add("B");
		myL.add("C");
		myL.add("F");
		myL.add("D");
		myL.add("Y");
		myL.add("S");
		
		int listSize = myL.size();
		System.out.println(listSize);
		
		System.out.println("List before remove element");
		System.out.println(myL);
		
		myL.remove(0);
		
		System.out.println("List after remove element");
		System.out.println(myL);
		
		System.out.println(myL.get(3));
		
		/*
		//Declare List - another way
		ArrayList myL2 = new ArrayList();
		
		myL2.add("A");
		myL2.add(3);
		*/
	}
}
