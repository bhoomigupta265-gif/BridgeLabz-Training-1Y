import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        float add = number1 + number2;
        float sub = number1 - number2;
        float mul = number1 * number2;

        if (number2 != 0) {
            float div = number1 / number2;

            System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2 + " is:");

            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
            System.out.println("Division: " + div);
        } else {
            System.out.println("\nDivision not possible because second number is 0");
            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
        }
    }
}




