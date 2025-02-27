import java.util.Scanner;
public class AreaOfCircle {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter radius : ");
double radius = input.nextDouble();
double areaOfCircle = Math.PI * radius * radius;
System.out.println("Area of circle is " + areaOfCircle);
}
} 
