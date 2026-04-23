import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st number: ");
        double a = scanner.nextDouble();
        System.out.println("2nd number: ");
        double b = scanner.nextDouble();
        System.out.println("3rd number: ");
        double c = scanner.nextDouble();
        System.out.println("4th number: ");
        double d = scanner.nextDouble();
        System.out.println("5th number: ");
        double e = scanner.nextDouble();
        double avrg = (a + b + c + d + e) / 5;
        System.out.println("Avarage is: " + avrg);
    }  
}
