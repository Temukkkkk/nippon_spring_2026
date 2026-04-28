import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("JILIIN ORLOGO: ");
        double income = scanner.nextDouble();
        double tax;
        if (income <= 10000000)
            tax = income * 0.10;
        else if (income <= 50000000) 
            tax = income * 0.15;
        else
            tax = income * 0.20;
        System.out.println("TATWAR: " + tax);
    }
}
