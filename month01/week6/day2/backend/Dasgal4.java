package month01.week6.day2.backend;

import java.util.Scanner;

public class Dasgal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        int sum = 0;
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < 5; i++){
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        double avarage = sum / 5.0;
        System.out.println("NIILBER = " + sum);
        System.out.println("DUNDAJ = " + avarage);
    }
}
