package discountApplicable;
/*Create a program that checks if the purchase is above $100 and prints "Discount Applicable".
   The program should accept a double 'purchaseAmount' as input.*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("keshav bhardwaj");
		double purchaseAmount = sc.nextDouble();
		System.out.println(purchaseAmount);
		Discount k = new Discount();
		k.discountApplicable(purchaseAmount);
	}

}
