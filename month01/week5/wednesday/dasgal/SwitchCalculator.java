import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the op: ");
        char op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result: a + b = " + (a + b));
                break;
            case '-':
                System.out.println("Result: a - b = " + (a - b));
                break;
            case '*':
                System.out.println("Result: a * b =" + (a * b));
                break;
            case '/':
                if (b != 0)
                System.out.println("Result: a / b = " + (a / b));
                else
                System.out.println("0-D HUWAAJ BOLOHGUI");
                break;
            default:
                System.out.println("Invalid OP");
                break;
        }
    }
}
