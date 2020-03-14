package javaP;

public class ClassA2 {

	//Constructor 
	//Its name must be same as class name
	//It doesn't have any return type, not even void
	//** It execute automatically when object is created
	
	public ClassA2(int t) {
		System.out.println(t);
		System.out.println("t");
	}
	
	public ClassA2(String s) {
		System.out.println(s);
	}
	
	public ClassA2() {
		System.out.println("Python");
	}
	
	//Can we have constructor as "private"  ..?
	
	public void method1() {
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2("Hi");
		obj.method1();
	}
	
	//difference between protected and default..?
}
