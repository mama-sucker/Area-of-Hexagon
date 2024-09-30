
// Module 4: Excercise 4.4 
// BY Addison Roy

// Imports 
import java.util.Scanner;

public class Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Area of Hexagon Calculator!");
        System.out.print("Enter the side of hexagon: ");
        double side = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
        System.out.printf("The area of this hexagon is: %.2f%n", area);

        scanner.close();
    }
}


