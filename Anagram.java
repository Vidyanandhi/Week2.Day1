package Assingnments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "stops";
		String str2 = "potss";
		boolean a = true;
		int length1 = str1.length();
		int length2 = str2.length();
		if(str1.length()!=str2.length())
			a= false;
		else {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			char[] charArray2 = str2.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			a= Arrays.equals(charArray1, charArray2);
			
			
		}
			
		if(a)
			System.out.println(str1 + " and " + str2 + " are anagrams");
		else
			System.out.println("not anagrams");

	}

}
