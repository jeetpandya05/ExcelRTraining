package JavaLearn;

import java.util.Scanner;

public class MiniProject {
	
	public static void main(String[] args) {
		// MINI PROJECT
		Scanner sc = new Scanner(System.in);
		int myNumber = (int) (Math.random()*100);
		int userNumber = 0;
		
		
		do {
			System.out.println("Guess a number (1-100) : ");
			userNumber = sc.nextInt();
			
			if (userNumber == myNumber) {
				System.out.println("Woohoo ... GUESS IS CORRECT!!!");
				break;
			}
				
			if (userNumber < myNumber) {
				System.out.println("Number is too small");
			 }
			if (userNumber > myNumber) {
				System.out.println("Number is too large");	
				}
			
		} while (userNumber >=0);
		
		System.out.print("My number was: ");
		System.out.println(myNumber);
		
	}
}
