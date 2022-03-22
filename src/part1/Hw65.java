package part1;

import java.util.Scanner;

public class Hw65 {

	public static void main(String[] args) {
		/*
		 * int x; 
		 * 
		 * Write a for loop that will print out a series of numbers starting at
		 * one less than x and ending at 0.
		 */
		
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt(); 
		
		for (int i=x-1; i>=0; i--) {
			System.out.println(i);
		}
	}

}
