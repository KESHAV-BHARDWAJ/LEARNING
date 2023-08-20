package gradeCheck;
import java.util.Scanner;
//Create a program that checks if a student's grade is above 50 and prints "Pass", else it prints "Fail".
//The program should accept an integer 'grade' as input.
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		GradeCheck k = new GradeCheck();
		k.marksobtain(grade);

	}

}
