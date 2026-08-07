package binarySearch.lec_41;

public class main {

    static boolean isValidAnswer(int[] arr, int k, int maxPages) {
        int studentCount = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages) {
                pages = pages + arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;

    }

    public int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        int n = arr.length;
        int s = 1;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int e = sum;
        int ans = -1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    static void main() {

    }

}
