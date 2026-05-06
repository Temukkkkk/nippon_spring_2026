import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NIIT DUN: ");
        double total = scanner.nextDouble();
        double discount;
        if (total < 100000) 
            discount = total * 0;
        else if (total <= 499999)
             discount = total * 0.05;
        else if (total <= 999999) 
            discount = total * 0.10;
        else
            discount = total * 0.15;  
        double finalPrice = total - discount;
        System.out.println("HUNGULULT: " + discount);
        System.out.println("TOGTSON UNE: " + finalPrice);
        }
    }