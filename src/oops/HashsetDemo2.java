package oops;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> obj= new HashSet<Integer>();
		obj.add(110);
		obj.add(120);
		obj.add(130);
		obj.add(140);
		obj.add(150);
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.contains(140));
		
//		for each loop 
		
		for(int g:obj) {
			System.out.println(g);
		}
		
		
		
		
		
		
		
		

	}

}
