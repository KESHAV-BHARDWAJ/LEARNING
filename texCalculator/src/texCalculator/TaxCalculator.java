package texCalculator;
import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double amount = sc.nextDouble();
		double tax = sc.nextDouble();
		double cost = calculateTotalWithTax(amount,tax);
		System.out.println("total cost including tax = "+cost);
	}
	public static double calculateTotalWithTax(double amount,double tax){
		return amount+tax;
	}

}
