import java.util.Scanner;
public class CalculateSimpleInterest {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal : ");
		int principal = input.nextInt();
		System.out.println("Enter rate : ");
		int rate = input.nextInt();
		System.out.println("Enter time : ");
		int time = input.nextInt();
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("the simple interest is " + simpleInterest);
	}
}
