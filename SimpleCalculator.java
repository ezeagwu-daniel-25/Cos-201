import java.util.Scanner;

/**
 * COS 201 - Week 3 Practical
 * SimpleCalculator: reads two numbers and displays the results of
 * addition, subtraction, multiplication, division and remainder.
 *
 * Author: Ezeagwu Ugochukwu Daniel
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("\n--- Results ---");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            double remainder = num1 % num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);
            System.out.println(num1 + " % " + num2 + " = " + remainder);
        } else {
            System.out.println("Division and remainder are not possible when the second number is 0.");
        }

        input.close();
    }
}
