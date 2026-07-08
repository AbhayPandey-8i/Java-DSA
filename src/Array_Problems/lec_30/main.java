package Array_Problems.lec_30;

import java.util.*;

public class main {

    //Problem 1
    public int[] twoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    //Problem 2
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }

                }
            }


        }
        return new ArrayList<>(result);
    }

    //Problem-3
    public int removeDuplicates(int nums []){
        int n = nums.length;
        int i = 0;
        int j = 1;

        while (i<j){
            if (nums[i] == nums[j]){
                j++;
            }
            else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    //Problem 4
    public int findFirstRepeatingElement(int nums []){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i: nums){
            if (freq.get(i)>1){
                return i;
            }
        }
        return -1;
    }

    //Problem 5
    public int pivotIndex(int[] nums){
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for (int i = 1; i < n ; i++) {
            leftSum[i] = leftSum[i-1] + nums[i];
        }

        rightSum[n-1] = nums[n-1];
        for (int i = n-2; i >= 0 ; i++) {
            rightSum[i] = rightSum[i+1] + nums[i];
        }

        for (int i = 0; i < n ; i++) {
            if (leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    static void main() {

    }
}
