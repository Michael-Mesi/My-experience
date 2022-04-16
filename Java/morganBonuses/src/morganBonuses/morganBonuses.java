package morganBonuses;
import java.util.Scanner;

public class morganBonuses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fullweek=0 ,posreviews=0; 
		//the first array size corresponds to the number of full weeks worked, the second corresponds to the number of positive reviews1
		double bonus[][] = new double[7][5];
		
		//enter all the possible bonuses into the array
		bonus[0][0] = 5.00;
		bonus[0][1] = 9.00;
		bonus[0][2] = 16.00;
		bonus[0][3] = 22.00;
		bonus[0][4] = 30.00;
		
		bonus[1][0] = 10.00;
		bonus[1][1] = 12.00;
		bonus[1][2] = 18.00;
		bonus[1][3] = 24.00;
		bonus[1][4] = 36.00;
		
		bonus[2][0] = 20.00;
		bonus[2][1] = 25.00;
		bonus[2][2] = 32.00;
		bonus[2][3] = 42.00;
		bonus[2][4] = 53.00;
		
		bonus[3][0] = 32.00;
		bonus[3][1] = 38.00;
		bonus[3][2] = 45.00;
		bonus[3][3] = 55.00;
		bonus[3][4] = 68.00;
		
		bonus[4][0] = 46.00;
		bonus[4][1] = 54.00;
		bonus[4][2] = 65.00;
		bonus[4][3] = 77.00;
		bonus[4][4] = 90.00;
		
		bonus[5][0] = 60.00;
		bonus[5][1] = 72.00;
		bonus[5][2] = 84.00;
		bonus[5][3] = 96.00;
		bonus[5][4] = 120.00;
		
		bonus[6][0] = 85.00;
		bonus[6][1] = 100.00;
		bonus[6][2] = 120.00;
		bonus[6][3] = 140.00;
		bonus[6][4] = 175.00;
		
		//until the user desires to exit
		while(fullweek!=-1)
		{
			//print helpful message
			System.out.print("\nEnter number of full weeks worked(-1 to quit): ");
			fullweek = input.nextInt();	//prompt to input full weeks worked
			if(fullweek ==-1)	//if user wants to exit break loop
				break;
			System.out.print("\nEnter number of positive reviews: ");	//prompt for number of positive reviews
			posreviews = input.nextInt();	
						
			if(fullweek >0)	//if its a valid input
			{
				if(fullweek > 6)	//if its greater than 6, just make it 6 since its the same bonus
					fullweek = 6;
				
				if(posreviews>4)	//if its greater than 4 make it 4 since its the same bonus
					posreviews = 4;
				
				System.out.println("\nTotal bonus is: " + bonus[fullweek][posreviews]); //use the numbers as the indices to print the corresponding bonus
				
			}
			else	//print bad input error
				System.out.print("\nPlease enter a valid positive number");

		}	
		System.out.print("\nThanks have a great day! ");	//print sign off message
	}

}
