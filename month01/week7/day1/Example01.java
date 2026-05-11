public class Example01 {
    
    
    static void printLine(String text){
        System.out.println(text);
    }

    static int square(int n){
        return n * n;
    }
    static String stringConcat(String name){
        return "Hello " + name;
    }
    static void aboutME(){
        System.out.println("My name is Temulen");
        System.out.println("I'm 21 y.o");
    }
    static String repeat(String s, int times){
        String result = "";
        for(int i = 0; i < times; i++){
            result += s;
        }
        return result;
    }
    static boolean isEven(int n){
        return n % 2 == 0;
    }
    
    public static void main(String[] args) {
        printLine("Hello");
        printLine("Test");

        int a = square(4);
        System.out.println(a);
        int b = square(15);
        System.out.println(b);
        System.out.println(square(16));

        System.out.println(stringConcat("Temulen"));
        System.out.println(stringConcat("Saraa"));
        System.out.println(stringConcat("Bataa"));

        aboutME();

        System.out.println(repeat("*", 5));
        System.out.println(repeat("+", 15));
        System.out.println(repeat("<>",10));

        System.out.println(isEven(5));
        System.out.println(isEven(4));
    }
}