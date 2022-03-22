package part1;

public class Hw61 {

	public static void main(String[] args) {
		/*
		 * Write a program that uses for loop to prints multiplication of number 3 from
		 * 1 to 10
		 */
		
		int num=3; 
		int result; 
		
		for (int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+ "*"+i+"="+result);
		}
	}

}
