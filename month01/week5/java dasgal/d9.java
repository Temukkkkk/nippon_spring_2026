import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scanner.next();
        if (color.equalsIgnoreCase("ULAAN")) {
            System.out.println("ZOGS");
        }
        else if (color.equalsIgnoreCase("SHAR")) {
            System.out.println("BELEN BOL");
        }
        else if (color.equalsIgnoreCase("NOGOON")) {
            System.out.println("YWJ BOLNO"); 
        }
        else
            System.out.println("BURUU UNGU ORUULSN BN");
            
        }
    }