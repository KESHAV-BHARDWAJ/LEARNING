package nestedSwitch;
import java.util.Scanner;
//Example of “NESTED SWITCH” control construct using Science club example where only B.tech student are allowed.

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 if you are b.tech student.");
		int num=sc.nextInt();
		switch (num) {
			case 1:
				System.out.println("welcome to the Science club");
				System.out.println("1=(cse),2=(ece),3=(it),4=(civil)");
				System.out.println("inter number between 1 to 4");
				int input = sc.nextInt();
				switch (input) {
					case 1:
						System.out.println("wecome cse Student");
						break;
					case 2:
						System.out.println("welcome ece Student");
						break;
					case 3:
						System.out.println("welcome it Student");
						break;
					case 4:
						System.out.println("welcome civil Student");
						break;
					default:
						System.out.println("get out");
				}
				break;
			default:
				System.out.println("you can not take part in science club");

		}
	}
}


