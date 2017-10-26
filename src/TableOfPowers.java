import java.util.Scanner;
import java.lang.Math;

/**
 *	Program requests user to input a number and outputs
 *	a table of squared and cubed numbers from 1 up to 
 *	the number provided by the user.
 *
 *	@author Alexander Cyr
 *
 */

public class TableOfPowers {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		String continueRun = "y";
		int userVal = 0;
		
		System.out.println("Learn your squares and cubes!");
		
		//Loop the program until ended by user
		while(continueRun.equalsIgnoreCase("y")) {
			
			System.out.println();
			System.out.print("Enter an integer: ");
			userVal = validInput();
			
			System.out.println();

			System.out.println("Number      Squared     Cubed        ");
			System.out.println("======      =======     =====        ");
			
			//for each number up to user number, print formatted number, squared and cubed
			for(int i = 1; i <= userVal; ++i) {
				System.out.format("%-12d%-12d%-12d", i, Math.round(Math.pow(i, 2)), Math.round(Math.pow(i, 3)));
				System.out.println();
			}
			System.out.println();
			
			scnr.nextLine();
			System.out.print("Continue? (y/n): ");
			continueRun = scnr.nextLine();
			
		}
		
		System.out.println("Program terminated.");
		
	}
	
	public static int validInput() {
		int userNumber = 0;
		boolean valid = false;
		
		while (!valid) {
			
			//Loop until user provides a number
			while (!scnr.hasNextInt()) {
				System.out.print("Invalid entry. Enter a number greater than 0: ");
				scnr.nextLine();
			}

			userNumber = scnr.nextInt();

			//Check to see if user number is greater than zero
			if (userNumber > 0) {
				valid = true;
			} else {
				System.out.print("Invalid entry. Enter a number greater than 0: ");
				scnr.nextLine();
			}
		}
		
		return userNumber;
	}
}
