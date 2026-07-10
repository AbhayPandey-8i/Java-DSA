package Array_Problems.lec_31;

import java.util.ArrayList;
import java.util.List;

public class main {

    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> ans = new ArrayList<>();

      int n = nums.length;
        for (int i = 0; i < n ; i++) {
            int value = Math.abs(nums[i]);
            int position = value - 1;

            if (nums[position] > 0){
                nums[position] = -nums[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    static void main() {

    }

}
