import java.util.Scanner;
public class ConvertKilometersToMiles {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in kilometers: ");
		double distanceInKilometers = input.nextDouble();
		double distanceInMiles = distanceInKilometers * 0.621371;
		System.out.println("The distance in miles is " + distanceInMiles);
	}
}
