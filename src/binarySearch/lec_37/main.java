package binarySearch.lec_37;

public class main {

    //lowerBound
    static int getLowerBound (int[] arr, int target){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int ans = -1;

        while (i<=j){
            int mid = i + (j-i)/2;
            if (arr[mid] >= target){
                ans = mid;
                j = mid - 1;
            }
            else{
                i = mid +1;
            }
        }
        return ans;

    }

    //getUpperBound
    static int upperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
         int e = n-1;
         int ans = -1;

         while (s <= e){
             int mid = s + (e-s)/2;
             if (arr[mid] <= target){
                 s = mid + 1;
             }
             else {
                 ans = mid;
                 e = mid - 1;
             }
         }
         return ans;
    }


    static void main() {
        int[] arr = {10,20,30,30,40,50};
        int target = 35;
        int result = upperBound(arr, target);
        System.out.println(result);

    }
}
