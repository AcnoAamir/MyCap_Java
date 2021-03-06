package prac;

import java.util.Scanner;

class Employee{
	String name,Address;
	int year_of_joining,salary;
	public Employee(String n,int yr,int sal,String add) {
		name=n;
		year_of_joining=yr;
		salary=sal;
		Address=add;
	}
	public void print() {
		System.out.println("\nEmployee Details - ");
		System.out.println("Name - "+name+"\nYear of Joining "+year_of_joining+"\nAddress "+Address);
	}
}
public class ABC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n,add;
		int yr,sal;
		System.out.println("Enter details of 1st employee <Name,Year of Joining,Salary,Address>");		
		n=sc.next();
		yr=sc.nextInt();
		sal=sc.nextInt();
		add=sc.nextLine();
		Employee e1=new Employee(n, yr, sal, add);
		System.out.println("Enter details of 2nd employee <Name,Year of Joining,Salary,Address>");		
		n=sc.next();
		yr=sc.nextInt();
		sal=sc.nextInt();
		add=sc.nextLine();
		Employee e2=new Employee(n, yr, sal, add);
		System.out.println("Enter details of 3rd employee <Name,Year of Joining,Salary,Address>");		
		n=sc.next();
		yr=sc.nextInt();
		sal=sc.nextInt();
		add=sc.nextLine();
		Employee e3=new Employee(n, yr, sal, add);
		e1.print();
		e2.print();
		e3.print();
	}
}
/*
Output
Enter details of 1st employee <Name,Year of Joining,Salary,Address>
Robert 1994 1000 64C- WallsStreet 
Enter details of 2nd employee <Name,Year of Joining,Salary,Address>
Sam 2000 5000 68D- WallsStreet
Enter details of 3rd employee <Name,Year of Joining,Salary,Address>
John 1999 200 26B- WallsStreet

Employee Details - 
Name - Robert
Year of Joining 1994
Address  64C- WallsStreet 

Employee Details - 
Name - Sam
Year of Joining 2000
Address  68D- WallsStreet

Employee Details - 
Name - John
Year of Joining 1999
Address  26B- WallsStreet

Sample Input
Robert 1994 1000 64C- WallsStreet 
Sam 2000 5000 68D- WallsStreet
John 1999 200 26B- WallsStreet
 */
