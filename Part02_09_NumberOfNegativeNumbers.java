
import java.util.Scanner;

public class NumberOfNegativeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberNegatives = 0;
		while (true) {
			System.out.println("Give a number: ");
			//Takes user input.
			int userInput = Integer.valueOf(scanner.nextLine());

			//Compares input. If input is negative, increments counter by 1.
			if (userInput < 0) {
				numberNegatives = numberNegatives + 1;
			}

			//Compares input. If input is '0' then exit loop. 
			if (userInput == 0) {
				break;
			}

		}
		//Prints the number of negative numbers inputted by the user.
		System.out.println("Number of negative numbers: " + numberNegatives);

	}
}
