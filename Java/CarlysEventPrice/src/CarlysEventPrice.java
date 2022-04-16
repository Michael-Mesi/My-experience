import java.util.Scanner;
//This program asks for a number of guests for an event, then calculates the cost and prints out a receipt style message.
public class CarlysEventPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How Many guests will be attending your event?:  ");	
		int guestNum = input.nextInt(); 	// input the guest amount
		

		int eventCost = guestNum * 35;		//cost of a single person attending times the number of guests

		System.out.print("\n\n****************************************************\n");	//add spacing and make border
		System.out.print("*   Carly's makes the food that makes it a party   *\n");
		System.out.print("****************************************************\n");
		System.out.printf("\tNumber of guests: %d%n  ", guestNum);	//print number of guests
		System.out.print("\tPrice per guest: $35\n");				//print price per guest
		System.out.printf("\tTotal event cost : $%d%n", eventCost);	//print total event cost
		System.out.print("\tEvent has at least 50 people: ");		//print message of whether or not there are at least 50 people
		if(guestNum >= 50) {					//if true print yes
			System.out.print("Yes");
		}
		else {									//if false print no
			System.out.print("No");
	
		}
	}

}
