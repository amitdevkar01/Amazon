package java_basic;

public class SmallestAndlargest_2 {

	public static void main(String[] args) {

            String s = "I Love Aai";
            
            String smallword = "";
            String largeword = "";
            
            String[] words = s.split("\\s+");
            smallword = largeword= words[0];
            
            for(String word:words) {
            	
            	if(word.length() < smallword.length()) {
            		smallword= word;
            		
            	}
            	
            	if(word.length() > largeword.length()) {
            		largeword = word;
            	}
            	
            	
            }
            
            System.out.println("Small word is "   +smallword);
            System.out.println("large word is "+  largeword);
            
	}

}
