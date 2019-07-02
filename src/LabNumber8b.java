import java.util.InputMismatchException;
import java.util.Scanner;

public class LabNumber8b {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] name = {"Joe", "Bob", "Nancy", "Gina", "George", "Kyle", "Vincent", "David", "James", "Ricky"};
		String[] lastName = {"Blow", "Saget", "Drew", "Bobina", "Lopez", "Dixon", "Lane", "Watkins", "Brown", "Bobby"};
		String[] homeTown = {"Detroit", "Austin", "Flint", "Seattle", "Hell", "Atlanta", "San Fransisco", "Los Angelas", "Las Vegas", "Honolulu"};
		String[] favFood = {"Crab", "Cookies", "Steak", "Brownies", "Pizza", "Jerky", "Chicken", "Ribs", "Burger", "Salmon"};

		int index = opening(scnr, "Welcome to our java class. Which student would you like to learn more about?", name);
		System.out.println(index);
	}
	private static int opening(Scanner scnr, String prompt, String[] name) {
		boolean isValid = false;
		int userNum = 0;
		do {
			System.out.println(prompt);
			for(int i = 0; i < name.length; i++) {
				System.out.println((i + 1) + ". " + name[i]);
			}
			try {
				userNum = scnr.nextInt();
				
			}catch(InputMismatchException ex) {
				System.out.println("That was not a number. Please try again.\n(Enter a number between 1-10)");
				scnr.nextLine();
				continue;
			}
			int userNum2 = userNum;
			isValid = validateNumber(userNum2);
		} while (!isValid);
	return userNum;
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