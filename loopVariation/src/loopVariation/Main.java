package loopVariation;

public class Main {

	public static void main(String[] args) {
		int s=10;
		int count=0;
		do
		{
			System.out.println("KODNEST...");
			s+=3;//(s=s+2)
			count++;
		}
		while(s<=15);

		System.out.println(count);
	}

}
