package recursion;

public class lec_63 {

    static boolean solve(int [] nums, int target, int index){
        if(target == 0){
            return true;
        }

        if(target<0 || index >= nums.length){
            return false;
        }

        boolean include = solve(nums, target-nums[index], index+1);
        boolean exclude = solve(nums, target, index+1);

        return include || exclude;


    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int index = 0;
        for(int num: nums){
            sum += num;
        }

        if(sum % 2 != 0){
            return false;
        }

        int target = sum/2;

        boolean ans = solve(nums, target, index);
        return ans;

    }

}
