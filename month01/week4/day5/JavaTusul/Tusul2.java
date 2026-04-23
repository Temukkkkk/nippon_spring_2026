import java.util.Scanner;

public class Tusul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, name2, name3;
        double price1, price2, price3;
        int too1, too2, too3;

        System.out.println("1r baraa");
        System.out.print("Name: ");
        name1 = scanner.next();
        System.out.print("Price: ");
        price1 = scanner.nextDouble();
        System.out.println("Too: ");
        too1 = scanner.nextInt();

        System.out.println("2r baraa");
        System.out.print("Name: ");
        name2 = scanner.next();
        System.out.print("Price: ");
        price2 = scanner.nextDouble();
        System.out.println("Too: ");
        too2 = scanner.nextInt();

        System.out.println("3r baraa");
        System.out.print("Name: ");
        name3 = scanner.next();
        System.out.print("Price: ");
        price3 = scanner.nextDouble();
        System.out.println("Too: ");
        too3 = scanner.nextInt();

        double sub1 = price1 * too1;
        double sub2 = price2 * too2;
        double sub3 = price3 * too3;

        double subtotal = sub1 + sub2 + sub3;
        double vat = subtotal * 0.10;
        double total = subtotal + vat;

        System.out.println("/n============================");
        System.out.println("DELGUURIIN BARIMT");
        System.out.println("/n============================");
        System.out.println("BARAA UNE TOO DUN");

        System.out.println("Niilber: " +subtotal);
        System.out.println("NOAT: " + vat);
        System.out.println("NIIT DUN: " + total);
    }
}