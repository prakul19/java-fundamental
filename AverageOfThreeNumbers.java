import java.util.Scanner;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Enter the third number: ");
        double thirdNumber = input.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of three numbers is " + average);
    }
}

