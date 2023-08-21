
/*In a far-off galaxy named Arithmetica, beings have been using a newly discovered number system to make their life easier. However, they are facing difficulties in performing basic arithmetic operations. As the resident genius of planet Earth, you have

been called upon to help them. Your first task is to build a function that will be able to add two numbers in their number system.

Function:

public static long galacticAddition(long num1, long num2);

Inputs:

The function galacticAddition(long num1, long num2) will receive two parameters:

· num1 : a long integer representing the first number in the Arithmetica number system.

· num2 : a long integer representing the second number in the Arithmetica number system.

Outputs:

The function will return a long - the sum of num1 and num2 in the Arithmetica number system.*/

package galacticArithmetic;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1= ");
		long num1=sc.nextLong();
		System.out.println("Enter num2= ");
		long num2=sc.nextLong();
		Addition k = new Addition();
		System.out.println(k.galacticAddition(num1, num2));
		sc.close();

	}

}
