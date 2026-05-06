import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class d7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String pwd = scanner.next();

        boolean hasUpper = !pwd.equals(pwd.toLowerCase());
        boolean hasDigit = pwd.matches(".*\\d.*");
        int len = pwd.length();
        if (len > 8 && hasDigit && hasDigit)
            System.out.println("HUCHTEI");
        else if (len > 6 && (hasUpper || hasDigit))
            System.out.println("DUND");
        else
            System.out.println("SUL");
    }    
}
