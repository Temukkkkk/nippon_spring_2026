package month01.week6.day2.backend;

public class Dasgal5 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};

        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("MAXIMUM NUMBER = " + max);
        System.out.println("MINIMUM NUMBER = " + min);
    }
}
