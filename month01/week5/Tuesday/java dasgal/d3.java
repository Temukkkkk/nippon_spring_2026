import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a tal");
        int a = scanner.nextInt();
        System.out.println("b tal");
        int b = scanner.nextInt();
        System.out.println("c tal");
        int c = scanner.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Gurwaljin bish");
        }
        else if (a == b && b == c) {
            System.out.println("tegsh talt gurwaljin");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("Tegsh hoyr talt gurwaljin");
        }
        else {
            System.out.println("Yriin gurwaljin");
        }
    }
}
