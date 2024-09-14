package java_basic;

public class SmallestAndLongest {

	public static void main(String[] args) {
		
	
		        String s = "I love India";
		        
		        String smallestWord = "";
		        String largestWord = "";
		        
		        // Split the string into words
		        String[] words = s.split("\\s+");
		        
		        // Initialize smallest and largest words
		        smallestWord = largestWord = words[0];
		        
		        for (String word : words) {
		            if (word.length() < smallestWord.length()) {
		                smallestWord = word;
		            }
		            if (word.length() > largestWord.length()) {
		                largestWord = word;
		            }
		        }
		        
		        System.out.println("Smallest Word: " + smallestWord);
		        System.out.println("Largest Word: " + largestWord);
		    }
		

       
	}


