import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your name: ");
        String name = scanner.nextLine();

        System.out.println("Give me your age: ");
        int age = scanner.nextInt();

        System.out.println("Give me your City: ");
        String City = scanner.next();

        System.out.println("=============================");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your City: " + City);
        System.out.println("=============================");
    }
}
