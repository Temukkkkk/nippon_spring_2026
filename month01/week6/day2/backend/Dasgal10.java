package month01.week6.day2.backend;

public class Dasgal10 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int [] rev = new int [nums.length]; 
        for(int i = 0; i < nums.length; i++){
            rev[i] = nums [nums.length - 1 -i];
        }
        System.out.println("Reverse: ");
        for(int num : rev){
            System.out.println( num + " ");
        }
    }
}
