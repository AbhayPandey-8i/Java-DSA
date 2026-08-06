package binarySearch.lec_42;

public class main {

    static boolean isValidAns(int [] boards, int k, int mid){
        int n = boards.length;
        int painterCounter = 1;
        int paintedLength = 0;


        for(int i = 0; i < n; i++){
            if(paintedLength + boards[i] <= mid){
                paintedLength = paintedLength + boards[i];
            }
            else {
                painterCounter++;
                paintedLength = 0;
            }
                if(painterCounter > k || boards[i] > mid){
                    return false;
                }
                else{
                    paintedLength = paintedLength + boards[i];
                }
            }

        return true;
    }



    public int minTime(int [] boards, int k){
        int n = boards.length;
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += boards[i];
        }

        int s = 1;
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValidAns(boards, k ,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
       return ans;
    }


    static void main() {

    }

}
