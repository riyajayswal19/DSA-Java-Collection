package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		
		String s1 = "raoe";
		String s2 = "care";
		
		// Convert into lowercase 
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() == s2.length()){
			
			char s1charArray[] = s1.toCharArray();
			char s2charArray[] = s2.toCharArray();
			
			Arrays.sort(s1charArray);
			Arrays.sort(s2charArray);
			
			boolean result = Arrays.equals(s1charArray, s2charArray);
			if(result == true){
				System.out.println("Anagram");
			}else{
				System.out.println("Not Anagram");
			}
			
			
		}else{
			System.out.println("Lengths are not equal");
		}
		
		



	}

}
