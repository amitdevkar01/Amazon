package oops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> obj =new  ArrayList<Integer>();
  obj.add(10);
  obj.add(20);
  obj.add(30);
  obj.add(40);
  obj.add(50);
  System.out.println(obj);
  System.out.println(obj.size());
  System.out.println(obj.get(3));
  
  try {
  System.out.println(obj.get(5));
  }
  catch(Exception c) {
	  System.out.println("Exception handled");
  }
  
  obj.add(60);
  System.out.println(obj);
  
  obj.remove(3);
  System.out.println(obj);
  
  obj.set(2, 77);
  System.out.println(obj);
  
  System.out.println(obj.contains(77));
  
  for(int i = 0;i<obj.size();i++) {
	  System.out.println(obj.get(i));
	  
  }
  for(int j:obj) {
	  System.out.println(j);
  }
  
  
   
	}

}
