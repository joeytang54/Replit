package part1;

import java.util.Scanner;

public class Hw37 {
	
	public static void main(String[] args) {
	/*
	 * For you to do:
	 * Take 2 boolean inputs from a user:
	 * "Are you thirsty?"
	 * "Are you sleepy?"
	 * If user is thirsty and not sleepy--> drink=water
	 *  If user is thirsty and sleepy--> drink=coffee
	 * If user is not thirsty and sleepy --> drink=tea
	 *Otherwise drink="nothing"
	 *Output: Output: Looks like you need to drink ___
	 */

		Scanner scan=new Scanner(System.in); 
		
		System.out.println("Are you thristy?");
		boolean thristy=scan.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy=scan.nextBoolean(); 
		
		if (thristy && !sleepy) {
			System.out.println("Looks like you need to drink water" );
		}else if (thristy && sleepy) {
			System.out.println("Looks like you need to drink coffee"); 
		}else if (!thristy && sleepy) {
			System.out.println("Looks like you need to drink tea" );
		}else {
			System.out.println("Looks like you need to drink nothing"); 
		}
		
	}
	}
