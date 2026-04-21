import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Celsius number: ");
        double Celsius = scanner.nextDouble();
        System.out.println("Result: ");
        double fahrenheit = Celsius * 9 / 5 + 32;
        System.out.println(fahrenheit);
    }    
}
