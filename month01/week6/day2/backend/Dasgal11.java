package month01.week6.day2.backend;

import java.util.Arrays;

public class Dasgal11 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println("TOP 3 UTGA: ");
        System.out.println(nums[n - 1]);
        System.out.println(nums[n - 2]);
        System.out.println(nums[n - 3]);
    }
}
