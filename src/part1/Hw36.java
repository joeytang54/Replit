package part1;

import java.util.Scanner;

public class Hw36 {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings"and two
		 * integers: "Please enter two numbers"
		 * 
		 * and make the comparisons:
		 * 
		 * if int1 and int2 are equal and word1 and word2 are equal, output "AND" 
		 * if int1 and int2 are equal or word1 a d word2 are equal, output "OR" 
		 * if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE" Example
		 * input/output:** word1: banana word2: banana int1: 2 int2: 2 Output: AND
		 ** Example input/output:** word1: banana word2: banana int1: 2 int2: 2 Output:
		 * AND word1: banana word1: banana word2: apple word2: apple int1: 2 int1: 2
		 * int2: 2 int2: 2 Output: OR ​ word1: phone word2: pie int1: 2 int2: 3 Output:
		 * NONE
		 */
		
		Scanner scan=new Scanner (System.in); 
		System.out.println("Please entre two strings");
		String word1=scan.next(); 
		String word2=scan.next(); 
		
		System.out.println("Please enter two numberes");
		int int1=scan.nextInt();
		int int2=scan.nextInt();
		
		if (word1.equals(word2) && int1==int2) {
			System.out.println("AND");
		}else if (word1==word2||int1 == int2 ) { 
			System.out.println("OR");
		}else if ( word1 !=word2 && int1 != int2) {
			System.out.println("NONE");
		}
		
	}

}
