package java_basic;

public class Reverse_String {

	public static void main(String[] args) {

     String str= "Amit";
     String rev ="";
     
     int len = str.length();
     for(int i=len-1;i>=0;i--) {
    	 rev =rev+str.charAt(i);
    	 
     }
		System.out.println(rev);
	}

}
