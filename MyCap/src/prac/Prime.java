package prac;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value to check ");
		int x=sc.nextInt();
		int c=0;
		if(x<=2)
			System.out.println(x+" is Prime");
		else{
			for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				c=1;
				break;
			}
			}
			if(c==0)
				System.out.println(x+" is Prime");
			else
				System.out.println(x+" is Not Prime");
			
		}
	}

}
