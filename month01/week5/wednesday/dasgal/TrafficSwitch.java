import java.util.Scanner;

public class TrafficSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scanner.next();
        switch (color) {
            case "Green":
                System.out.println("Go!");
                break;
            case "Red":
                System.out.println("Stop!");
                break;
            case "Yellow":
                System.out.println("Caution!");
                break;
            case "Blue":
                System.out.println("Unknown signal");
                break;
            default:
                System.out.println("Invalid Color");
                break;
        }
    }    
}
