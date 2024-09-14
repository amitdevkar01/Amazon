package oops;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a []= {"Amit","Shubham","RAm","RAvi"};
		System.out.println(Arrays.toString(a));   ///First Approach
		
		for(int i=0;i<a.length;i++) {
			System.out.println( a[i]+""); //Second approach
		}
		System.out.println("");
		
		for(String k:a) {                     //Third approach
			System.out.println(k);
		}

	}

}
