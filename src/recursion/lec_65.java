package recursion;

public class lec_65 {


    boolean solve(int [] nums, int index){

        if(index == nums.length - 1){
            return true;
        }

        if(index >= nums.length){
            return false;
        }

        if( nums[index] == 0 ){
            return false;
        }

        int jumpValue = nums[index];
        boolean finalAns = false;
        for(int jump = 1; jump <= jumpValue; jump++){
            boolean recAns = solve(nums, index+jump) ;
            finalAns = finalAns || recAns;
        }

        return finalAns;

    }

    public boolean canJump(int[] nums) {
        int index = 0;
        boolean ans = solve(nums, index);
        return ans;
    }

}
