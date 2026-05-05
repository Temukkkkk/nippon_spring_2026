package month01.week6.day2.backend;

public class Dasgal8 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        double avarage = sum / (double) nums.length;
        System.out.println("DUNDAJ = " + avarage);
        System.out.println("DUNDAJAAS IH UTGUUD: ");

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > avarage) {
                System.out.println(nums[i]);
            }
        }
    }
}
