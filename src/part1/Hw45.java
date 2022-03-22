package part1;

import java.util.Scanner;

public class Hw45 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Ask the user to enter any number from 1-7.
		 * 
		 * Based on the number define the day of the week
		 * 
		 * Example Output:
		 * 
		 * Input a number between 1-7 Input a number between 1-7 Friday Friday Example
		 * Output:
		 * 
		 * Input a number between 1-7 Input a number between 1-7 Invalid
		 */

		System.out.println("Input a number between 1-7");
		Scanner scan=new Scanner(System.in); 
		int num=scan.nextInt();
		String day; 
		
		switch (num) {
		case 1:
			day="Monday"; 
			break; 
		case 2:
			day="Tueday"; 
			break;
		case 3:
			day="Wednesday"; 
			break;
		case 4:
			day="Thursday"; 
			break;
		case 5:
			day="Friday"; 
			break;
		case 6:
			day="Saturday"; 
			break;
		case 7:
			day="Sunday"; 
			break;
			default:
			day="Invalid"; 
			
		}System.out.println(day);
		
	}

}
