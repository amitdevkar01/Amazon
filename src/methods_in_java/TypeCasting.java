package methods_in_java;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub..
		
//		widening casting(up Casting)
		int x= 9;
		long y=x;
		
		float k=y;
		System.out.println("After conversion ,int value" +x);
		System.out.println("After conversion ,float value" +y);
		
		
		double d= 166.33;
		long l = (long) d;
		int i =(int) l;
		
		
		System.out.println("After conversion into long type"+l);
		System.out.println("After conversion into int type" +i);
		

	}

}
