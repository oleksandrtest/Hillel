import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        var nums = new int[]{14, 231, 2, 3214, 2, 434};
        var sum = 0;
        var prev = 0;

        for (int i = 0; i < nums.length; i++) {
                sum = prev + nums[i];
                prev = sum;
                nums[i] = sum;
        }

        System.out.println(Arrays.toString(nums));
    }
}