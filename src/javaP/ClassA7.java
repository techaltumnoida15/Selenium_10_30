package javaP;

public class ClassA7 {

	public void method1() {
		
		try {
			int t = 5/5;
			System.out.println(t);
		}
		catch(Exception ex) {
			System.err.println("Can not divide by Zero");
			System.out.println(ex.toString());
		}
	}
	
	public void method2() {
		int[] arr1 = {1, 5, 2, 4};
		
		//System.out.println(arr1[1]);
		
		//System.out.println(arr1[4]);
	}
	
	//5 Exception in selenium
	//Error state that "org.openqa.selenium.NoAlertPresentException: no such alert
	// 5 exception from java
	
	public void method3(){
		try {
			int t = 10/0;
//			int[] arr = {1, 3, 5, 7};
//			System.out.println(arr[9]);
		}
		
//		catch(ArithmeticException ex) {
//			System.out.println("Can not divide by 0");
//		}
//		
//		catch(Exception ex) {
//			System.out.println("Catching another exception");
//		}
		
		finally {
			System.out.println("Always");
		}
		
		//finally is block - It gives you gurantee that code written inside will get execute always.
		
	}
	
	public static void main(String[] args) {
		ClassA7 obj = new ClassA7();
		obj.method3();
	}
}
