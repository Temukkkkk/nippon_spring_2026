import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me A: ");
        int a = scanner.nextInt();
        System.out.println("Give me B: ");
        int b = scanner.nextInt();
        
        System.out.println("NIILBER: ");
        int Sum = a + b;

        System.out.println(Sum);
    }
}
