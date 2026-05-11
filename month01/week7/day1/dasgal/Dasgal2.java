public class Dasgal2 {

    static int double_(int n) {
        return n * 2;
    }

    static String shout(String s) {
        return s.toUpperCase() + "!";
    }

    static boolean isBig(int n) {
        return n > 100;
    }

static void stamp(String label, int value) {
    System.out.println(label + " = " + value);
}
    public static void main(String[] args) {
        System.out.println(double_(7));          // (a)
    System.out.println(double_(double_(3))); // (b)
    System.out.println(shout("hello"));      // (c)
    System.out.println(isBig(50));           // (d)
    System.out.println(isBig(200));          // (e)
    stamp("Дүн", double_(45));               // (f)
    }
}
