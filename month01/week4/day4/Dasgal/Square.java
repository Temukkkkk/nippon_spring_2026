import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TAL ORUUL: ");
        double a = scanner.nextDouble();
        double area = a * a;
        double perimetr = a * 4;
        double diognal = a * Math.sqrt(2);
        System.out.println("Area: " + area);
        System.out.println("Perimetr: " + perimetr);
        System.out.println("Diognal: " + diognal);
    }    
}
