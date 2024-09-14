package methods_in_java;

public class Method_overloading {
	
	public void add()
	{
		System.out.println("No arguments");
	}
	public void add(int a,int b) {
		System.out.println("Adding two number" +(a+b));
		
	}
	public void add(String s1,String s2) {
		System.out.println(s1+""+s2);
	}
	public void add(int d,double g) {
		System.out.println("different types of Arguments");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading obj =new Method_overloading();
		obj.add();
		obj.add(20,40);
		obj.add(11,12);
		obj.add("amit", "varun");
		obj.add(30, 25.3);
	}

}
