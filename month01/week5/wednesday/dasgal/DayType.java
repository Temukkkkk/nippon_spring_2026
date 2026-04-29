import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day: ");
        String day = scanner.next();
        switch (day) {
            case "Monday":
                System.out.println("Working day");
                break;
            case "Tuesday":
                System.out.println("Working day");
                break;
            case "Wednesday":
                System.out.println("Working day");
                break;
            case "Thursday":
                System.out.println("Working day");
                break;
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
                System.out.println("Holiday");
                break;
            case "Sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}