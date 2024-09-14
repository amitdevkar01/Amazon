package methods_in_java;

public class Child extends Parent {
	public void marriage() {
		System.out.println("Method overriding takes place");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.marriage();
		
		

	}

}
