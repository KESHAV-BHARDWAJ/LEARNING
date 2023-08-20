package theCalculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		int c=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter 1-Addition,2-Subtraction,3-Multiplication,4-Division");
		int input=sc.nextInt();
		switch(input) {
		case 1:c=a+b;
		System.out.println("the addition of "+a+" and "+ b+" is= "+c);
		break;
		case 2:c=a-b;
		System.out.println("the subtraction of "+a+" and "+ b+" is= "+c);
		break;
		case 3:c=a*b;
		System.out.println("the multiplication of "+a+" and "+ b+" is= "+c);
		break;
		case 4:c=a/b;
		System.out.println("the division of "+a+" and "+ b+" is= "+c);
		break;
		default:
			System.out.println("invalid input provided");
			
		}
	}

}
