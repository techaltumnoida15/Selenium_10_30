package javaP;

public class ClassA1 {

	public void addNum() {
		System.out.println("Java");
	}
	
	public void multiplyNum() {
		int t = 4 * 5;
		System.out.println(t);    //20
		System.out.println("t");  // t
	}
	
	public void multiplyNum(int a, int b) {
		int t = a * b;
		System.out.println(t);
	}
	
	//If there are two or more methods with same name in a class then it is know as METHOD OVERLOADING;
	//It happens in same class
	
	static public void main(String[] abc) {
		//System.out.println("Hi");
		
		//className objnectName = new className();
		
		ClassA1 obj = new ClassA1();
		//obj.addNum();
		obj.multiplyNum(5, 7);
	}
	
	static public void main(int[] abc) {
		//System.out.println("Hi");
		
		//className objnectName = new className();
		
		ClassA1 obj = new ClassA1();
		//obj.addNum();
		obj.multiplyNum(5, 7);
	}
	
	//Yes, we can overload main method
}
