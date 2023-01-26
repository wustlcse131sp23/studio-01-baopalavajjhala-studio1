package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year would you like to test?");
		int year = in.nextInt();
		
		
		boolean leap4 = year % 4 == 0;
		boolean leap400 = year % 400 == 0;
		boolean leap100 = year % 100 == 0;
		boolean leap = leap4==true && leap100==false || leap400==true;
		
				// true when divisible by 400
				// false when divisible by 100
	
				//true when divisible by 4

		System.out.println(leap);

		// TODO Auto-generated method stub

	}

}
