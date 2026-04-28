import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("JIN (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("UNDUR (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("bmi: " + bmi);
        if (bmi < 18.9) 
            System.out.println("Turanhai");
        else if (bmi <= 24.9) 
            System.out.println("Hewiin");
            else if (bmi <= 29.9) 
                System.out.println("Iluudel jintei");
            else
                System.out.println("Targalalt");
            }
        }