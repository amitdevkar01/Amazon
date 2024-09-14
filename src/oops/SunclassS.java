package oops;

public class SunclassS implements D {

	@Override
	public void d1() {
     System.out.println("BY");		
	}

	@Override
	public void d2() {
System.out.println("GO");		
	}

	
	public static void main(String[] args) {
		SunclassS obj = new SunclassS();
		obj.d1();
		obj.d2();
	}
}

