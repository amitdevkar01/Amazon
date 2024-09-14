package oops;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("No Arguments constructor");
	}
	public ConstructorDemo(int d) {
		System.out.println("Here is parameterized  constructor ");
	}
	public ConstructorDemo(String s) {
		System.out.println("Iam parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj =new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(20);
		 ConstructorDemo obj2 = new ConstructorDemo("hello");

	}

}
