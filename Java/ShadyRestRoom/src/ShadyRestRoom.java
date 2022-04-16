import java.util.Scanner;
public class ShadyRestRoom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice; 
		double price;
		System.out.println("1: Queen for $125 ");
		System.out.println("2: King for $139 ");
		System.out.println("3: King and Pullout couch for $165 ");
		choice = input.nextInt(); 	//input room choice
		
		if(choice == 1)
		{
			price = 125.00;
			System.out.println("\nYou have chosen the queen, that will be $" + price);

			
		}
		else if(choice ==2)
		{
			price = 139.00;
			System.out.println("\nYou have chosen the king, that will be $" + price);

		}
		else if(choice ==3)
		{
			price = 165.00;
			System.out.println("\nYou have chosen the king and the pullout couch, that will be $" + price);
		}
		else
		{
			System.out.println("That was not a valid choice, please enter 1, 2, or 3.");
			price =0;
			
		}
	}

}
