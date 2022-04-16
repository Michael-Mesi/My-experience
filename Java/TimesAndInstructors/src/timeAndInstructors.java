import java.util.Scanner;

public class timeAndInstructors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		String course[][] = new String[5][3];
		boolean flag = false;	//if this is never set to true no class has been found
		
		//input all course info into the arrays
		course[0][0] = "mon 9am";
		course[0][1] = "Farrell";
		course[0][2] = "CIS101";
		
		course[1][0] = "Mon 11am";
		course[1][1] = "Patel";
		course[1][2] = "CIS210";
		
		course[2][0] = "Tues 8:30am";
		course[2][1] = " Wong";
		course[2][2] = "MKT100";
		
		course[3][0] = "Tues 6pm";
		course[3][1] = "Deitrich";
		course[3][2] = "ACC150";
		
		course[4][0] = "Fri 1pm";
		course[4][1] = "Lenno";
		course[4][2] = "CIS101";
		
		//print out the course names so its easy to type them
		System.out.println("**************************************************");
		for(int i=0; i< 5; i++)
		{
				System.out.println("\t\tCourse: "+ course[i][2]);
		}
		System.out.println("**************************************************");
		System.out.print("\tPlease enter the course name: ");	//prompt for input
		String a = input.next();	
		
		for(int i=0; i< 5; i++)		//index through until course name is found then print all info
		{
			if(course[i][2].equals(a)) {
				System.out.println("Course: "+ course[i][2] + "\t Time: " +course[i][0] + "\tInstructor: " + course[i][1]  );
				flag = true;	//set to true for a class found
			}
		}	//if flag is never set, class was never found
		if(flag ==false)
			System.out.println("\n\tThere is no such class");


	}

}
