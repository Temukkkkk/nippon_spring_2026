package month01.week6.day2.backend;

public class Dasgal6 {
    public static void main(String[] args) {
        int [] nums = {45, 12, 78, 3, 56, 29, 41, 67, 8, 34};

        int target = 42;
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == target) {
                System.out.println("42 OLDLOOO");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("42 OLDSONGUI");
        }
    }
}
