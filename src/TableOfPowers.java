import java.util.Scanner;
import java.lang.Math;

public class TableOfPowers {
	
	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		String continueRun = "y";
		int userVal = 0;
		
		System.out.println("Learn your squares and cubes!");
		
		while(continueRun.equalsIgnoreCase("y")) {
			
			System.out.println();
			System.out.print("Enter an integer: ");
			userVal = validInput();
			
			System.out.println();

			System.out.println("Number      Squared     Cubed        ");
			System.out.println("======      =======     =====        ");
			
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

			while (!scnr.hasNextInt()) {
				System.out.print("Invalid entry. Enter a number greater than 0: ");
				scnr.nextLine();
			}

			userNumber = scnr.nextInt();

			if (userNumber > 0 && userNumber <= 100) {
				valid = true;
			} else {
				System.out.print("Invalid entry. Enter a number greater than 0: ");
				scnr.nextLine();
			}
		}
		
		return userNumber;
	}
}
