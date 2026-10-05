package recursion;

import java.util.ArrayList;
import java.util.List;

public class lec_68 {
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        int currValue = nums[index];

        // Include
        output.add(currValue);
        solve(nums, index + 1, output, ans);

        // Backtrack
        output.remove(output.size() - 1);

        // Exclude
        solve(nums, index + 1, output, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(nums, 0, output, ans);

        return ans;
    }
}
