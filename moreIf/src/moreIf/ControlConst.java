package moreIf;
import java.util.Scanner;
public class ControlConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();
		Check k = new Check();
		k.checkEligibility(marks);

	}

}
