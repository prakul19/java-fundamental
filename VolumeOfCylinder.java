import java.util.Scanner;
public class VolumeOfCylinder {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the radius : ");
double radius = input.nextDouble();
System.out.println("Enter the height : ");
double height = input.nextDouble();
double volumeOfCylinder = Math.PI * radius * radius * height;
System.out.println("The volume of the cylinder is " + volumeOfCylinder);
}
}
