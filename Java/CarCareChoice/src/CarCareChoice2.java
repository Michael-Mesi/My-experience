import java.util.Scanner;
public class CarCareChoice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in = "";
		boolean flag = false;
		java.util.ArrayList<String> ServiceList = new java.util.ArrayList<String>();	//create String list to hold the Services
		java.util.ArrayList<Integer> PriceList = new java.util.ArrayList<Integer>();	//create integer list to hold costs
		//add elements to corresponding arrays
		ServiceList.add("oil change");
		PriceList.add(25);
		ServiceList.add("tire rotation");
		PriceList.add(22);
		ServiceList.add("battery check");
		PriceList.add(15);
		ServiceList.add("break inspection");
		PriceList.add(5);
		System.out.println("*******************************************************************");//explain input
		for(int i=0; i < ServiceList.size(); i++)
		{
				System.out.println("\t\t\t" + ServiceList.get(i));//print price and service		
		}
		System.out.println("*******************************************************************");//explain input
		//prompt for input
		System.out.println("Enter the first three characters of The service you would like");//explain input
		in = input.nextLine();
		//loop through arrays
		for(int i=0; i < ServiceList.size(); i++)
		{
			if(in.equals(ServiceList.get(i).substring(0, 3)))
			{
				System.out.println(ServiceList.get(i) + ": $" + PriceList.get(i));//print price and service
				flag = true;	//set flag to true
			}				
		}
		if(flag == false)
		{
			System.out.println("Sorry, that service does not exist");//print error
		}
		

	}

}
