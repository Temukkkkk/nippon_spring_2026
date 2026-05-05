package month01.week6.day2.backend;

public class Array01 {
    public static void main(String[] args) {
        double [] ButarhaiToonuud = {1.4, 1.5, 1.6, 1.7};
        String [] Nernuud = {"Bat", "Bold", "Chimeg"};
        boolean [] hudluud = {false, false, false};
        char [] Usegnuud = {'A', 'B'};
        System.out.println(Nernuud);
        System.out.println(Nernuud[0]);
        System.out.println(ButarhaiToonuud[1]);
        System.out.println(Usegnuud[1]);
        System.out.println(hudluud[2]);
        ButarhaiToonuud[1] = 11.4;
        System.out.println(ButarhaiToonuud[1]);
        System.out.println(Usegnuud.length);
        double [] myNumber = {1.23, 12.3, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9};
        myNumber[5] = myNumber[5] + 1;
        myNumber[0] = 0;
        myNumber[myNumber.length - 1] = myNumber[myNumber.length - 1] + 8;
        for(int i = 0; i < myNumber.length; i++){
            System.out.println(myNumber[i]);
        }
    }
}
