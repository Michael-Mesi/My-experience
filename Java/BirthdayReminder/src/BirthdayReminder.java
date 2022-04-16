import java.util.Scanner;

public class BirthdayReminder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		java.util.ArrayList<String> NameList = new java.util.ArrayList<String>();	//create integer list to hold the inputs
		java.util.ArrayList<String> BirthdayList = new java.util.ArrayList<String>();	//create integer list to hold the inputs
		
		String i="", j=""; //i holds name, j holds birthday
		int k=0;	//keeps track of elements added to arrays
		boolean flag =false;
		System.out.println("Enter the names of your friends followed by their birthdate");//explain input
		while(!i.equals("ZZZ") )	//until user enters ZZZ keep looping
		{
			if(k == 10)		//if the user has entered 10 times, break the loop
				break;
			
			System.out.print("Name: ");	//prompt for name input
			i = input.next();	//prompt for input
			if(i.equals("ZZZ"))	//iff sentinal value is input break the loop
				break;
			System.out.print("\nBirthday:  ");	//prompt for birthday input
			j = input.next();				
			NameList.add(i);	//add name to list
			BirthdayList.add(j);	//add birthday to list
			
			k++;	//increment counter
			System.out.println("\nEnter Another? (ZZZ to  quit) ");	//print continue message
		}
		System.out.println("Search for your friends birthday!");	//print search message
		i="";		//reset i;
		while(!i.equals("ZZZ") )	//until user wants to stop
		{
			System.out.print("Name: ");	//print name prompt
			i = input.next();		//prompt for input
			if(i.equals("ZZZ"))	//if sentinall value is input break the loop
				break;
			for(k=0; k< NameList.size();k++)	//else search through the name list
			{
				if(NameList.get(k).equals(i))	//if its found print the birthday and break
				{	
					System.out.print("\nBirthday:  " + BirthdayList.get(k));
					flag = true;
					break;
				}
			}
			
			if(flag = false)	//if not found print corresponding message
				System.out.println("That name could not be found");

			System.out.println("\nSearch Another? (ZZZ to  quit) ");	//prompt for another search
		}
		
	}
}
