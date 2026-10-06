package binarySearch.lec_44;

public class main {

    static boolean isValidAns(int trees[], int m, int mid){
        long totalWoodCollected = 0;

        for(int i = 0; i< trees.length; i++){
            if (trees[i] > mid){
                long currentWoodCollected = trees[i] - mid;
                totalWoodCollected += currentWoodCollected;
            }
        }
        if(totalWoodCollected >= m){
            return true;
        }else{
            return false;
        }
    }

    public int maxSawHeight(int[] trees, int m){
        int n = trees.length;
        int s = 0;
        int maxi = -1;

        for(int i = 0; i<n; i++){
            if (trees[i]>maxi){
                maxi = trees[i];
            }
        }

        int e = maxi;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(trees, m, mid)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;

    }

    static void main() {

    }

}
