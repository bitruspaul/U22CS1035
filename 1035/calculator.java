import java.util.Scanner;

public
 
class
 
calculator2
 
{
    public
 
static
 
void
 
main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number (1 or 2 digits): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (1 or 2 digits): ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Validate input
        if (isValidInput(num1, num2)) {
            double result = performOperation(num1, num2, operation);
            System.out.println("Result: " + result);
        }
    }

    // Check if the numbers are 1 or 2 digits
    static boolean isValidInput(int num1, int num2) {
        if (num1 < 0 || num1 > 99 || num2 < 0 || num2 > 99) {
            System.out.println("Error: Input must be 1 or 2 digits.");
            return false;
        } else {
            return true;
        }
    }

    // Perform the chosen operation
    static double performOperation(int num1, int num2, char operation)
 
{
        switch (operation) {
            case
 
'+':
                return num1 + num2;
            case
 
'-':
                return num1 - num2;
            case
 
'*':
                return num1 * num2;
            case
 
'/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;  // Or return Double.NaN to indicate an error
                } else {
                    return (double) num1 / num2;  // Cast to double to handle decimals
                }
            default:
                System.out.println("Error: Invalid operation symbol.");
                return 0;  // Or return Double.NaN to indicate an error
        }
    }
}