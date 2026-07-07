package Array_Problems.lec_29;

import java.util.Arrays;

public class main {

    static int[] sortArrays(int arr []){
            int n = arr.length;
            int i = 0;
            int j = n-1;

            while (i < j){
                if (arr[i] == 1 && arr[j] == 0){
                    arr[i] = 0;
                    arr[j] = 1;
                }
                if (arr[i] == 0){
                    i++;
                }
                if (arr[j] == 1){
                    j--;
                }
            }
            return arr;
    }

    public int missingNum (int arr[]){
        int xorSum = 0;
        for (int n: arr){
            xorSum = xorSum ^ n;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

   public static void main() {
        int arr [] = {1,0,0,1,0,1};
        int [] res = sortArrays(arr);
        System.out.println(Arrays.toString(res));
    }

}
