import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Baraanii ner: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter rough number: ");
        double number = scanner.nextDouble();
        double niitune = price * number;
        System.out.println("Niit une: " + niitune);
    }    
}
