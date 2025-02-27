import java.util.Scanner;
public class CelsiusToFahrenheitConversion {
	public static void main(String[] args) 	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius ");
		float temperatureInCelsius = input.nextFloat();
		float temperatureInFahrenheit = ( temperatureInCelsius * 9/5)+32;
		System.out.println("The tenpreature in fahrenheit is " + temperatureInFahrenheit);
	}
}
