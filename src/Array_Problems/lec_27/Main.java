package Array_Problems.lec_27;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    //Problem-1
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    //Problem-2
    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    //Problem-3
    static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    //Problem-4
    static int getMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Problem-5
    static int[] sum(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveSum = positiveSum + arr[i];
            }
            if (arr[i] < 0) {
                negativeSum = negativeSum + arr[i];
            }
        }
        int[] ans = {positiveSum, negativeSum};
        return ans;
    }

    //Problem-6
    static int[] getZeroOneCount(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    //Problem-7
    static int getUnsortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[1]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    //Problem-8
    static int[] swapArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int num = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = num;
        }
        return arr;
    }

    //    Problem-9
    static int[] intersection(int[] arr, int[] brr) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr) {
            set1.add(num);
        }

        for (int num : brr) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] res = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            res[i++] = num;
        }
        return res;
    }

    //problem 10
    static int[] alternate(int[] arr) {
        int res[] = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int i = 0;

        while (left < right) {
            if (left == right) {
                break;
            }
            res[i] = arr[left];
            res[i + 1] = arr[right];
            left++;
            right--;
            i += 2;
        }
        return res;
    }

    static void main() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int res[] = alternate(arr);
        System.out.println(Arrays.toString(res));

//        int brr [] = {1, 2, 2, 3, 4};
//        int arr [] = {2, 2, 4, 5};
//        int res [] = intersection(arr, brr);
//        System.out.println(Arrays.toString(res));

//        int arr[] = {1,2,3,4,5,6};
//        int ans[] = swapArray(arr);
//        for(int i:ans){
//            System.out.println(i);
//        }

//        int [] arr = {1,2,3,4,2,5};
//        System.out.println(getUnsortedArray(arr));

//        int arr [] = {1,0,1,0,1,1,0};
//        int ans[] = getZeroOneCount(arr);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);

//        int [] arr = {2,-3,-5,-7,9};
//        int [] ans = sum(arr);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);

//        int[] arr = {2,5,6,7,9};
//        System.out.println(getMaximum(arr));

//         int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(findTarget(arr, 7));

//        int [] arr = {1,2,3,4,5};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("Printing ans array");
//        for (int i: ans){
//            System.out.println(i);
//        }

//        int[] arr = {2, 4, 1, 3};
//        System.out.println(getAverage(arr));


    }
}
