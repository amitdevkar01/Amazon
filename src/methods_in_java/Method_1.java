package methods_in_java;

public class Method_1 {
	
	public void loginPage() {
		System.out.println("Succesfully login");
	}
	
	public void add() {
		System.out.println(500+600);
	}
	public void sub() {
		System.out.println(1000-900);
	}
	public void mult() {
		System.out.println(10*9);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_1 obj =new Method_1();
		obj.loginPage();
		
		obj.add();
		obj.sub();
		obj.mult();
		

	}

}
