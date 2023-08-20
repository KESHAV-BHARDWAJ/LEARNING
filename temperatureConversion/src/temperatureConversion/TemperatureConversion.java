package temperatureConversion;
import java.util.Scanner;

class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("press:1-Convert Celsius to Fahrenheit \npress:2-Fahrenheit to Celsius");
		System.out.println("Enter your choice");
		int choice= sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the temperature in celsius =");
			double celsius = sc.nextDouble();
			double fahrenheit=celsiusToFahrenheit(celsius);
			System.out.println(celsius + "°C is equivalent to " + fahrenheit + "°F");
		}else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is equivalent to " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
	}

}
