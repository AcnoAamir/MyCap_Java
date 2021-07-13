// package prac;
import java.util.Scanner;

public class SwitchPrac{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Pick your greatings\nPress\t1 for Hi\t2 for Hey\t3 for Hola\t4 for Hello\t");
        int ch=sc.nextInt();
        System.out.print("Enter your name please\t");
        String name=sc.next();
//        System.out.println(ch+" "+name);
        switch (ch) {
		case 1:
			System.out.println("Hi "+name);
			break;
		case 2:
			System.out.println("Hey "+name);
			break;
		case 3:
			System.out.println("Hola "+name);
			break;
		case 4:
			System.out.println("Hello "+name);
			break;
		default:
			System.out.println("Invalid option ");
			break;
		}
    }
}
