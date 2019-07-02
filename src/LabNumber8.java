//Worked with David Watkins

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabNumber8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String[] name = { "Joe", "Bob", "Nancy", "Gina", "George", "Kyle", "Vincent", "David", "James", "Ricky" };
		String[] lastName = { "Blow", "Sagett", "Drew", "Bobina", "Lopez", "Dixon", "Lane", "Watkins", "Brown",
				"Bobby" };
		String[] homeTown = { "Detroit", "Austin", "Flint", "Seattle", "Hell", "Atlanta", "San Fransisco",
				"Los Angeles", "Las Vegas", "Honalulu" };
		String[] favFood = { "Crab", "Cookies", "Steak", "Brownies", "Pizza", "Jerky", "Chicken", "Ribs", "Burger",
				"Salmon" };
		String userInput = null;

		do {
			int index = opening(scnr, name, "Welcome to our Java class. Which student would you like to learn more about?");

			scnr.nextLine();

			System.out.println("Student " + (index + 1) + " is " + name[index] + " " + lastName[index]
					+ ". What would you like to know about " + name[index]);
			System.out.println("(Enter \"hometown\" or \"favorite food\")");

			boolean valid = false;
			do {
				userInput = scnr.nextLine();
				if (userInput.equalsIgnoreCase("hometown")) {
					System.out.println(name[index] + " hometown is: " + homeTown[index]);
					valid = true;
				} else if (userInput.equalsIgnoreCase("favorite food")) {
					System.out.println(name[index] + "'s favorite food is: " + favFood[index]);
					valid = true;
				} else {
					valid = false;
					System.out.println("That data does not exists. Enter (\"hometown\" or \"favorite food\")");
				}
			} while (!valid);

			System.out.println("Would you like to know another student? (\"yes\" or \"no\")");
			userInput = scnr.nextLine();
		} while (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));

		System.out.println("Thanks!");
		scnr.close();
	}

	private static int opening(Scanner scnr, String[] name, String prompt) {
		boolean isValid = false;
		int index = 0;
		do {
			System.out.println(prompt);
			for(int i = 0; i < name.length; i++) {
				System.out.println((i + 1) + ". " + name[i]);
			}
			try {
				index = scnr.nextInt();
				
			}catch(InputMismatchException ex) {
				System.out.println("That was not a number. Please try again.\n(Enter a number between 1-10)");
				scnr.nextLine();
				continue;
			}
			int userNum2 = index;
			isValid = validateNumber(userNum2);
		} while (!isValid);
	return index - 1;
	}

		
		
	private static boolean validateNumber(int index) {
		boolean isValid = false;
		String input = Integer.toString(index -1 );
		if(input.matches("[0-9]")){
			isValid = true;
		} else {
			isValid = false;
			System.out.println("That student does not exist. Please try again.\n(Enter a number between 1-10)");
		}
		return isValid;
	
	
     }


}
