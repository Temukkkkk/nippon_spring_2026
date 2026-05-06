package month01.week6.day2.backend;

public class Dasgal9 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int EvenSum = 0;
        int OddSum = 0; 
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                EvenSum += nums[i];
            } else {
                OddSum += nums[i];
            }
        }
        System.out.println("TEGSH TOONII NIILBER: " + EvenSum );
        System.out.println("SONDGOI TOONII NIILBER: " + OddSum);
    }
}
