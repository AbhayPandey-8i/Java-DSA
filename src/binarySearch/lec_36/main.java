package binarySearch.lec_36;

public class main {

    static int binarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = (start + end) / 2;

        while (start <= end){
            if (arr[mid] == target){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                start = mid - 1;
            }
            //updating mid
            mid = (start + end) / 2;
        }
        return -1;
    }

    static void main() {

    }

}
