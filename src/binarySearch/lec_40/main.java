package binarySearch.lec_40;

public class main {

    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int candidate = 0;
            int count = 0;

            for(int num: nums){
                if(count == 0){
                    candidate = num;
                }

                if(num == candidate){
                    count++;
                }

                else{
                    count--;
                }

            }
            return candidate;
        }
    }

    public int MySqrt(int x){
        int s = 1;
        int e = x;
        int ans = -1;

        if(x==0){
            return 0;
        }

        while(s <= e){
            int mid = s + (e-s)/2;

            if (mid == x/mid){
                return mid;
            }
            else if (mid > x/mid) {
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;

    }

    static void main() {

    }

}
