import java.util.Scanner;
public class PerimeterOfRectangle {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter length : ");
int length = input.nextInt();
System.out.println("Enter width : ");
int width = input.nextInt();
int perimeterOfRectangle = 2 * (length + width);
System.out.println("The perimeter of rectangle is " + perimeterOfRectangle);
}
}
