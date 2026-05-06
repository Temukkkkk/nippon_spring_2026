import java.util.Scanner;

public class d10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        if (n > 0)
            System.out.println("EYREG");
        else if (n < 0)
            System.out.println("SURUG");
        else
            System.out.println("TEG");

        if (n % 2 == 0)
            System.out.println("TEGSH");
        else
            System.out.println("SONDGOI");

        if (n % 5 == 0)
            System.out.println("5-D HUWAAGDNA");
        else
            System.out.println("5-D HUWAAGDAHGUI");

        int abs = Math.abs(n);

        if (abs < 10)
            System.out.println("NEG ORONTOI");
        else if (abs < 100)
            System.out.println("HOYR ORONTOI");
        else if (abs < 1000)
            System.out.println("GURWAN ORONTOI");
        else
            System.out.println("GURAW BA TUUNEES DEESH ORONTOI");
    }
}
