package week1.day2;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "kayak";
		String rev = "";

		for (int i = str.length()-1; i>=0;  i--)
		{

			rev  = rev + str.charAt(i);
		}		

		System.out.println("Reversed String: "+rev);
		if (str.equalsIgnoreCase(rev))
			System.out.println("Given text is palindrome");
		else 
			System.out.println("Given text is not palindrome");

	}
}






/*
 * Pseudo Code

 * a) Declare A String value as"madam"

 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */