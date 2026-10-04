package recursion;

public class lec_67 {

    static boolean solve(int [] arr, int k, int index, int sum){
        if(index>=arr.length){
            if(sum == k){
                return true;
            }
            else{
                return false;
            }
        }

        boolean include = solve(arr, k, index+1, sum+arr[index]);
        boolean exclude = solve(arr, k, index+1, sum);

        boolean finalAns = include || exclude;
        return finalAns;
    }

    public boolean checkSubsequenceSum(int[] arr, int k) {
        int index = 0;
        int sum = 0;
        boolean ans = solve(arr, k, index, sum);
        return ans;

    }

}
