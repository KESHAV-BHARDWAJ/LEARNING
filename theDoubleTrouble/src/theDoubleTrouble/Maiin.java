package theDoubleTrouble;
import java.util.Scanner;

public class Maiin {
	public static int doubleTheNumber(int num) {
		return 2*num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(doubleTheNumber(num));
		sc.close();

	}

}
