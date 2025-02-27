import java.util.Scanner;
public class PowerCalculation {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = input.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = input.nextInt();
		double result = Math.pow(base,exponent);
		System.out.println("The result is " + result);
	}
}

