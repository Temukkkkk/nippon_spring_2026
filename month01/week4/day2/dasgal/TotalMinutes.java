import java.util.Scanner;

public class TotalMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.println("Enter minute");
        int minute = scanner.nextInt();
        int NiitMinute = hour * 60 + minute;
        System.out.println("Niit minute = " + NiitMinute);
    }    
}
