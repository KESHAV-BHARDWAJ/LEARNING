package nestedIfElseLoop;
import java.util.Scanner;
//Example of “NESTED IF ELSE” control construct using Science club example where only B.tech syudent are allowed.

public class LoopExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 if you are b.tech student.");
		int num =sc.nextInt();
		if( num == 1) {
			System.out.println("welcome to the Science club");
			System.out.println("1=(cse),2=(ece),3=(it),4=(civil)");
			System.out.println("inter number between 1 to 4");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("wecome cse Student");
			}
			else if (input == 2) {
				System.out.println("welcome ece Student");
			}
			else if (input == 3) {
				System.out.println("welcome it Student");
			}
			else if (input == 4) {
				System.out.println("welcome civil Student");
			}
			else {
				System.out.println("get out");
			}
		}
		else{
			System.out.println("you can not take part inscience club");
		}
	}

}
