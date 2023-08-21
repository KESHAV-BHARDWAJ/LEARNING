package arithmeticOperation;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(additionNum(num1,num2));
		System.out.println(subtractNum(num1,num2));
		System.out.println(multiNum(num1,num2));
		System.out.println(divideNum(num1,num2));
		System.out.println(modulusNum(num1,num2));
		sc.close();

	}
	public static int additionNum(int num1,int num2) {
	return num1+num2;
	}
	public static int subtractNum(int num1,int num2) {
		if(num1>num2) {
			return num1-num2;
		}
		else {
			return num2-num1;
		}
	}
	public static int multiNum(int num1,int num2) {
		return num1*num2;
	}
	public static int divideNum(int num1,int num2) {
		if(num1>num2) {
			return num1/num2;
		}
		else {
			return num2/num1;
		}
	}
	public static int modulusNum(int num1,int num2) {
		return num1%num2;
	}

}
