package binarySearch.lec_39;

public class main {

    //finding pivot index
    public int findPivotIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        if (arr[s] <= arr[e]){
            return -1;
        }

        while (s<=e){
            int mid =  s + (e-s)/2;

            if (arr[mid] < arr[n-1]){
                e = mid - 1;
            } else {
                 ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }




    static void main() {

    }

}
