package part1;

import java.util.Scanner;

public class Hw63 {

	public static void main(String[] args) {
		/*
		 * int x; 
		 * 
		 * Write a for loop that will print out a series of numbers starting at 0
		 * and ending at the x(value must be taken from a user), exclusive.
		 */
		
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();  
		
		
for (int i=0; i<=x; i++) {
	if (x==i) {
		continue; 
	}System.out.print(i+" ");
}
	}

}
