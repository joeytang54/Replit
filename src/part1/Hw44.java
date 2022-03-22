package part1;

import java.util.Scanner;

public class Hw44 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: The output of your program should be:
		 * "Your favorite car is ___"
		 */
		System.out.println("Please enter you favorite car make");
		Scanner scan = new Scanner(System.in);
		String name= scan.next();
		String origin;
		
		switch (name){
		case "BMW":
			origin="german car";
			break; 
		case "Toyota":
			origin="japanese car"; 
			break; 
		case "Maserati":
			origin="italian car"; 
			break; 
			default:
				origin="unknown";
			
		}
		System.out.println("Your favorite car is "+origin);
	}

}
