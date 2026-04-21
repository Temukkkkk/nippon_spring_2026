import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your kg: ");
        double kg = scanner.nextDouble();
        System.out.println("Enter your m: ");
        double m = scanner.nextDouble();
        double BMI = kg / (m * m);
        System.out.println("BMI: " + BMI);
    }    
}
