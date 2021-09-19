package Assingnments;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "vidya";
		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) 
			rev = rev + str.charAt(i);
			if (str.equals(rev)) 
				System.out.println("it is a palindrome:");
			 else
				System.out.println("It is not a palindrome:");

		

	}

}
