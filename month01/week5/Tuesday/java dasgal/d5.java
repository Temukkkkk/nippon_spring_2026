import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month ==2)
            System.out.println("UWUL"); 
        else if (month >= 3 && month <= 5) 
            System.out.println("HAWAR");
        else if (month >= 6 && month <= 8) 
            System.out.println("ZUN");
        else if (month >= 9 && month <= 11) 
            System.out.println("NAMAR");
        else
            System.out.println("Buruu sar oruulsn bn");
        }
    }