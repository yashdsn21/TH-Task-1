import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double output;

        switch (operation) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                output = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter a valid operator (+, -, *, /).");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f", num1, operation, num2, output);

        scanner.close();
    }
}