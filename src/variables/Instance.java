package variables;

public class Instance {
	int i = 12;
	public void f1() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Instance  obj = new Instance ();
			System.out.println(obj.i);
			obj.f1();
		

	}

}
