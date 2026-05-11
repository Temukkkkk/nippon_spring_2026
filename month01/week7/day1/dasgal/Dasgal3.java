public class Dasgal3 {

    static void greetUser(String name, int age){
        System.out.println("Sain uu " + name + " Ta " + age + " nastai baina.");
    }
    static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        greetUser("Bataa", 20);

        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(100));
    }    
}
