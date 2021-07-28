package prac;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms of Fibonacci series to be printed ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(fibo(i)+" ");
		}
		System.out.println("\nOther way");
		fib(n);
	}
	
	static int fibo(int n) {
//		Recursion method
		int f;
	if(n==2)
		return 1;
	else if(n==1)
		return 0;
	else
		f=fibo(n-1)+fibo(n-2);
	return f;
	}
	
	static void fib(int n) {
//	Non recursive
		int f0=0,f1=1,f;
		n-=2;
		System.out.print(f0+" "+f1+" ");
		for(int i=0;i<n;i++) {
			f=f0+f1;
			f0=f1;
			f1=f;
			System.out.print(f+" ");
		}
	}
}
