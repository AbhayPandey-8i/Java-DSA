package recursion;

public class lec_64 {

    static int solve(int row, int sum, int [][] mat, int target){
        if(row >= mat.length){
            return Math.abs(target-sum);
        }

        int mini = Integer.MAX_VALUE;

        for(int num: mat[row]){
            int ans = solve(row+1, sum+num, mat, target);
            mini = Math.min(ans, mini);
        }
        return mini;

    }

    public int minimizeTheDifference(int[][] mat, int target) {
        int row = 0;
        int sum = 0;
        int ans = solve(row, sum, mat, target);
        return ans;
    }

}
