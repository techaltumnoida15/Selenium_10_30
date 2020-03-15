package javaP;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public void setExample() {
		//System.out.println("Hi");
		
		//Declare set
		//Unordered collection
		Set<String> mySet = new HashSet<>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("C");
		mySet.add("F");
		mySet.add("D");
		mySet.add("Y");
		mySet.add("S");
		
		System.out.println(mySet.size());
		
		System.out.println(mySet);
		
		
	}
	
	public static void main(String[] args) {
		SetEx obj = new SetEx();
		obj.setExample();
	}
}
