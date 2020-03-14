package javaP;

public class ClassA4 {

	public void ifElse() {
		if(true) {
			//code
		}
		else {
			//code
		}
	}
	
	public void forLoop(int t) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i * t);
		}
	}
	
	public void whileLoop(int t) {
		int i = 1;
		while(i <= 10) {
			System.out.println(i * t);
			i++;
		}
	}
	
	public void doWhileLoop(int t) {
		int i = 1;
		do {
			System.out.println(i * t);
			i++;
		}
		while(i <= 10);
	}
	
	public static void main(String[] args) {
		ClassA4 obj = new ClassA4();
		//obj.forLoop(11);
		//obj.whileLoop(11);
		obj.doWhileLoop(11);
	}
}
