import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me Radius number: ");
        Double r = scanner.nextDouble();
        System.out.println("Result: ");
        Double area = Math.PI * r * r;

        System.out.println(area);
    }
}
