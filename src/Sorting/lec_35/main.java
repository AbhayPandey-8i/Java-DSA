package Sorting.lec_35;

public class main {

    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int arr[]){
      int n = arr.length;
        for (int i = 0; i < n-1; i++) {
           int minIndex = i;

            for (int j = i+1; j < n ; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    static void insertionSort(int arr[]){
     int n = arr.length;
        for (int i = 1; i <n ; i++) {
           int curr = i;
           int prev = i-1;
           int currValue = arr[i];

           while (prev>=0 && currValue < arr[prev] ){
               arr[prev+1] = arr[prev];
               prev--;
           }
           arr[prev+1] = currValue;
        }

    }

    static void main() {

        int arr [] = {5,6,3,1,2};
        selectionSort(arr);
        for (int val : arr){
            System.out.println(val);
        }

//        int arr[] = {5, 4, 3, 1};
//        bubbleSort(arr);
//        for (int val : arr){
//            System.out.println(val);
//        }

    }

}
