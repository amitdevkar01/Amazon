package java_basic;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  marks = 7;
		if(marks>=75)
		{
			System.out.println("Distinction");
			
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("First class");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Failed");
		}

	}

}
