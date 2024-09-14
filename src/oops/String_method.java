package oops;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Amit Devkar";
		String s1 = "Amit Devkar";
		System.out.println(s.length());
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.concat("from Solapur"));
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.indexOf('t'));
		
		System.out.println(s.replace('m', 'h'));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	     String name =  "     Shubham ingale    ";
	     
	     System.out.println(name.trim());
	     
	     System.out.println(s.substring(2,5));
		

	}

}
