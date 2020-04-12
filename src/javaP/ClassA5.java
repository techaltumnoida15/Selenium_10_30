package javaP;

public class ClassA5 {
//difference between final. finally, finalize
	
	public void method1() {
		//final - Keyword
		//1. if it is used with var, then its value can not be changed.
		
		final int t = 10;
		//t = 15;
		System.out.println(t);
		
		String s1 = "Java";
		
		String s2 = "Java";
		
		String s3 = "Java";
		
		
	}
	
	
	
	//final - method: If a method is declared final then it can not be override
	
	//final - class: If a class is final then it can not be extends
	
	//String class in java - final  : why?
	//StringBuilder and StringBuffer : Difference
	
	/*
	 * public static void main(String[] args) { ClassA5 obj = new ClassA5();
	 * obj.method1(); }
	 */
}
