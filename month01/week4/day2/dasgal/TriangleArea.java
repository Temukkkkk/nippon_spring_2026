import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suuriig oruulna uu:");
        double suuri = scanner.nextDouble();
        System.out.println("Unduriig oruulna uu: ");
        double undur = scanner.nextDouble();
        System.out.println("Result:");
        double area = suuri * undur / 2;
        System.out.println(area);
    }
}
