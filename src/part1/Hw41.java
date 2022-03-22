package part1;

import java.util.Scanner;

public class Hw41 {

	public static void main(String[] args) {
		/*
		 * Write a program using the switch statement
		 * 
		 * Let us consider the scenario regarding the born baby age
		 * 
		 * First Output: "Enter the age of the Child" First Output:
		 * "Enter the age of the Child" case 1: if age is 1 print as "You can Crawl"
		 * case 1: if age is 1 print as "You can Crawl" case 2 : if age is 2 print as
		 * "You can Talk" case 2 : if age is 2 print as "You can Talk" case 3: If age is
		 * 3 print as "You can Dance" copied! case 3: If age is 3 print as
		 * "You can Dance" case 4: if age is 4 print as "You can get Trouble" case 4: if
		 * age is 4 print as "You can get Trouble" Other than this age (1-4) it should
		 * print "I don't know how old you are"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the Child");
		int age = scan.nextInt();
		String action;

		switch (age) {

		case 1:
			action = "You can Crawl";
			break;
		case 2:
			action = "You can Talk";
			break;
		case 3:
			action = "You can Dance";
			break;
		case 4:
			action = "You can get Trouble";
			break;
		default:
			action = "I don't know how old you are";
		}
		System.out.println(action);
	}

}
