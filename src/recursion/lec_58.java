package recursion;

public class lec_58 {

    static int solve (int arr[], int target, int s , int e){
         if(s>e){
             return -1;
         }


             int mid = s+(e-s)/2;

             if(mid == target){
                 return mid;
             }
             else if(arr[mid] > target ){
                 e = mid - 1;
             }
             else if(arr[mid] < target ){
                 s  = mid + 1;
             }



          return solve(arr, target, s, e);

    }

   public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60};
        int s = 0;
        int e = arr.length - 1;
        int target = 50;

        solve(arr, target, s, e);

    }


}
