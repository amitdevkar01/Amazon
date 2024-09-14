package oops;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {10,20,30,40};
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    
//    System.out.println(a[4]);
    
    try {
    	System.out.println(a[4]);
    }
    catch(Exception e) {
    	System.out.println("plz check array lenght and index");
    }
    System.out.println(a.length);
    
    
	}

}
