package part1;

import java.util.Scanner;

public class Hw40 {

	public static void main(String[] args) {
		/*
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor" First Output:
		 * "Enter name of the instructor" case 1: if User provided the name as Asghar as
		 * input it should show "Will take care of Java Assignment" copied! case 1: if
		 * User provided the name as Asghar as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Moazzam as input it should show "Will take care of SDLC Assignment" case 2:
		 * if User provided the name as Moazzam as input it should show
		 * "Will take care of SDLC Assignment" case 3: if User provided the name as
		 * Weqas as input it should show "Will take care of Selenium Assignment" case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment" case 4: if
		 * User provided the name as Asel as input it should show
		 * "Will take care of every Assignment" Other than these four names if the user
		 * provides any other names --> " Invalid instructor selected"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name=scan.next(); 
		String answer = null; 
		
		switch (name) {
		case "Asghar":
			answer ="Java Assignment"; 
			System.out.println("Will take care of "+answer);
			break; 
		case "Moazzam":
			answer ="SDLC Assignment"; 
			System.out.println("Will take care of "+answer);
			break; 
		case "Weqas":
		answer = "Selenium Assignment"; 
		System.out.println("Will take care of "+answer);
		break; 
		case "Asel":
			answer= "every Assignment"; 
			System.out.println("Will take care of "+answer);
		break;
		default: 
		System.out.println("Invalid instructor selected");	
		
	}
		 
		 
		}
}
