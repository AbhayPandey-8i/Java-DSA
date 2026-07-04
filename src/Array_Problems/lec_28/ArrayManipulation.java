package Array_Problems.lec_28;

import java.util.HashMap;

public class ArrayManipulation {

    //Problem-1
    static void reverseArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int k : arr){
            System.out.println(k);
        }
    }

    //Problem-2
    static void shiftby1 (int [] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for (int i = n-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

    }

    //Problem-3
    static void printAlternate(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i<=j){
            if (i == j){
                System.out.println(arr[i]);
                return;
            }
            System.out.println(arr[i]);
            i++;
            System.out.println(arr[j]);
            j--;
        }

    }

    //Problem 4
    static int getMode (int arr []) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//----------------------------------------------------------------------------------------
//         for (int i : freq.keySet()){
//             System.out.println(i + "=>" + freq.get(i));
//         }
//    }
//----------------------------------------------------------------------------------------
        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFreqency = freq.get(key);

            if (currentKeyKiFreqency > maxFreq) {
                maxFreqWaliKey = currentKey;
                maxFreq = currentKeyKiFreqency;
            }
        }
            return maxFreqWaliKey;


    }

    static int[] getHighestLowestFreqElement(int arr []){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) +1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key: freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }


    static void main() {
        int arr[] = {1,2,2,3,3,3,4,4,4,5,5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

//        int arr [] = {1,2,3,4,5,6};
//        shiftby1(arr);
//        for (int i : arr){
//            System.out.println(i);
        }

//        int arr [] = {1,2,3,4,5};
//        reverseArray(arr);
    }


