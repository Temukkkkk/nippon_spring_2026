import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter interest: ");
        double interest = scanner.nextDouble();
        double jilhuu = money * interest / 100;
        System.out.println("One year interest is: " + jilhuu);
    }
}
