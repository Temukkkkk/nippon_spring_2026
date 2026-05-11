public class Dasgal5 {

    static int multiply(int a, int b) {
    int result = a * b;
    return result;
}
    static boolean isOdd(int n) {
    return n % 2 != 0;
}
    static void printDouble(int n) {
        System.out.println("Hariu: " + n * 2);
    
}
    static int absolute(int n) {
    if (n < 0) return -n;
    return n;
}
    public static void main(String[] args) {
        System.out.println(multiply(4, 5));

        System.out.println(isOdd(3));

        printDouble(10);

        System.out.println(absolute(-5));
        System.out.println(absolute(5));
    }    
}
