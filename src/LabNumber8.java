//Worked with David Watkins

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabNumber8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] name = {"Joe", "Bob", "Nancy", "Gina", "George", "Kyle", "Vincent", "David", "James", "Ricky"};
		String[] lastName = {"Blow", "Saget", "Drew", "Bobina", "Lopez", "Dixon", "Lane", "Watkins", "Brown", "Bobby"};
		String[] homeTown = {"Detroit", "Austin", "Flint", "Seattle", "Hell", "Atlanta", "San Fransisco", "Los Angelas", "Las Vegas", "Honolulu"};
		String[] favFood = {"Crab", "Cookies", "Steak", "Brownies", "Pizza", "Jerky", "Chicken", "Ribs", "Burger", "Salmon"};
		
		String userInput = "y";
		
			
		do {
			int index = opening(scnr, "Welcome to our java class. Which student would you like to learn more about?", name);
			
			
			System.out.println("Student " + (index + 1) + " is " + name[index] + " " + lastName[index] + ". What would you like to know about " + name[index] + "?\nEnter \"hometown\" or \"favorite food\"");
			boolean isValid = false;
			do {
				
				userInput = scnr.nextLine();
				userInput = userInput.toLowerCase();
				if(userInput.equalsIgnoreCase("hometown")) {
					System.out.println(name[index] + " is from " + homeTown[index]);
					isValid = true;
				}else if(userInput.equalsIgnoreCase("favorite food")) {
					System.out.println(name[index] + "'s favorite food is " + favFood[index]);
					isValid = true;
				}else {
					isValid = false;
					System.out.println("That data does not exist. Please try again.\nEnter \"hometown\" or \"favorite food\"");
				}
				
			}while(!isValid);
			System.out.println("Would you like to know more(Yes/No)?");
			userInput = scnr.nextLine();
		}while(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));
	System.out.println("Thanks!");
	}
	private static int opening(Scanner scnr, String prompt, String[] name) {
		int index = -1;
		boolean isValid = false;
		
		for(int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + ". " + name[i]);
		}
		do {
			System.out.println(prompt);
			index = scnr.nextInt();
			if (index).matches("[0-9]")) {
				isValid = true;
				System.out.println("Got a valid name");
			} else {
			   System.out.println("Sorry! That number is not valid");
				isValid = false;
			}
			
		} while (!isValid);

	}

}
