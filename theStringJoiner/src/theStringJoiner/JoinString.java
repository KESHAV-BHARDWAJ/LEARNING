package theStringJoiner;
import java.util.Scanner;

public class JoinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println(joinStrings(str1,str2));
		sc.close();

	}
	public static String joinStrings(String str1, String str2){
		return str1+str2;
		
	}

}
