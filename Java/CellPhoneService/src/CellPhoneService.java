import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int minutes, texts, data;
		
		//PRINT WELCOME MESSAGE
		System.out.println("Welcome to the Cell plan helper");
		//PROMPT FOR MINUTES INPUT
		System.out.printf("enter 0 if you don't need any, 1 if you need more than 500 talk minutes per month, 2 for less:  ");
		minutes = input.nextInt(); 	//input room choice
		if(minutes !=0 && minutes !=1 && minutes!=2)	//check if valid
		{
			System.out.println("That was not a valid input, I shall assume you are fine with whatever");
			minutes =3;			//if there is no valid input, make it a positive so that it works with whatever
		}
		//prompt for texts input
		System.out.printf("enter 1 if you need more than 100 texts per month, 2 for less:  ");
		texts = input.nextInt(); 	//input room choice
		if(texts !=0 && texts !=1 && texts!=2)	//check if valid
		{
			System.out.println("That was not a valid input, I shall assume you are fine with whatever");
			texts =3;	//if there is no valid input, make it a positive so that it works with whatever
		}
		//prompt for data input
		System.out.printf("Enter 1 if you need more than 3 Gigabytes of data per month, 2 for less:  ");
		data = input.nextInt(); 	//input room choice
		if(data !=0 && data !=1 && data!=2)	//check if valid
		{
			System.out.println("That was not a valid input, I shall assume you are fine with whatever");
			data =3;			//if there is no valid input, make it a positive so that it works with whatever
		}
		//This begins the parsing of the response to get the best recommendation
		if(minutes == 2 && texts == 0 && data ==0)	// if user needs less than 500 minutes recommend plan A
		{
			System.out.println("You should try plan A! It is only $49 a month and gives you up too 500 talk minutes per month!");
		}
		else if(minutes == 2 && texts >0 && data ==0)	//if user needs less than 500 minutes and any texts recommend plan B
		{
			System.out.println("You should try plan B! It is only $55 a month and gives you up too 500 talk minutes per month and allows you to text!");
		}
		else if(minutes == 1 && data ==0)//if user needs at least 500 minutes and no data recommend plan C and D
		{
			System.out.println("Try Plan C for up to 100 text messages at $61 per month "
					+ "or Plan D for 100 text messages or more at $70 per month. ");
		}
		else if (data>0) // if user needs any data recommend plan E and F 
		{
			System.out.println("Try Plan E for up to 3 gigabytes at $79 or Plan F for 3 gigabytes or more at $87.  ");
		}
	}

}
