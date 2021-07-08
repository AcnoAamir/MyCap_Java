package prac;

import java.util.Scanner;

public class Min2Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to minute to year converter by Acno ");
		System.out.print("Enter the value of minutes to convert to years ");
		int min=sc.nextInt();
		convert(min);
	}
	static void convert(int min) {
		// 1 hr = 60min
		int hr=min/60;
		min-=(60*hr);
//		System.out.println("that is "+hr+" hrs and "+min+" min");
		// 1 day = 24hrs
		int day=hr/24;
		hr-=(24*day);
//		System.out.println("that is "+day+" days, "+hr+" hrs and "+min+" min");
		// 1 year =365days (ignoring leap year)
		int yr=day/365;
		day-=(365*yr);
		System.out.println("that is "+yr+" years, "+day+" days, "+hr+" hrs and "+min+" min");
	}
}

/*
 Output
Welcome to minute to year converter by Acno 
Enter the value of minutes to convert to years 123456789
that is 234 years, 323 days, 21 hrs and 9 min

Welcome to minute to year converter by Acno 
Enter the value of minutes to convert to years 3456789
that is 6 years, 210 days, 13 hrs and 9 min

 * */
