public class Dasgal1 {

    // a) "Сайн уу, [name]!" хэвлэх void метод
    static void greet(String name) {
        System.out.println("Сайн уу, " + name + "!");
    }

    // b) хоёр тооны их утгыг буцаах метод
    static int max(int a, int b) {
        if (a > b)
            return a = b;
        return max(a, b);
    }

    // c) тоо тэгш эсэхийг буцаах метод
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // d) тойргийн талбайг буцаах метод (π × r²)
    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        greet("Temulen");

        System.out.println(max(5, 4));

        System.out.println(isEven(5));

        double r = 5;
        double result = circleArea(r);
        System.out.println("HARIU: " + result);
    }
}
