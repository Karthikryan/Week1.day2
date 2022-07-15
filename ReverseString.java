package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Tata Consultancy Services";
		String rev = "";

		for (int i = str.length()-1; i>=0;  i--)
		{

			rev  = rev + str.charAt(i);
		}	
		System.out.println("Reversed String: "+rev);


	}

}


/*Classroom Assignment 3: Reverse the String
String str = "hello"; // olleh
Goal: To understand the String, loop
a) Create a class by name: ReverseString (with main method) in same package
b) Write a logic to reverse a String
c) Run and Confirm the reversed String is printed in console
Hint: Convert the String to characters, get the characters in reverse order and 
print every character without white space.
Time to given: 10 - 15 minutes.*/