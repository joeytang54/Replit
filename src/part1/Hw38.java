package part1;

import java.util.Scanner;

public class Hw38 {

	public static void main(String[] args) {
		/*
		 * Prompt user with a question: "Is it weekend?"
		 *
		 * If it is not a weekend --> subject="manual testing"
		 * 
		 * Otherwise --> subject="Java"
		 * 
		 * Output:
		 * 
		 * Today you will be learning ____
		 */

		Scanner scan=new Scanner(System.in); 
		System.out.println("Is it weekend?");
		boolean weekend=scan.nextBoolean(); 
		String answer; 
		
		if (!weekend) {
			answer="manual testing"; 
		}else {
			answer ="Java";
		}
		System.out.println("Today you will be learning "+answer);
	}

}
