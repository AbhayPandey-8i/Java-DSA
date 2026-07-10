package Array_Problems.lec_32;

public class kadaneAlgo {

    public int maxSubArray (int [] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            max = Math.max(max, sum);

            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    static void main() {

    }
}
