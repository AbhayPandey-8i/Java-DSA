package binarySearch.lec_45;

public class main {

    static boolean isValidans(int totalParantha, int [] cooks, int totalCook, int mid){
      int paranthaCount = 0;
        for (int i = 0; i < cooks.length; i++) {
           int currentCooksRank = cooks[i];
           int timeTaken = 0;
           int j = 1;

           while(timeTaken <= mid){
               if (timeTaken + j * currentCooksRank <= mid){
                   timeTaken = timeTaken + j * currentCooksRank;
                   paranthaCount++;
                   j++;
               }
               else{
                   break;
               }
           }
           if(paranthaCount >= totalParantha){
               return true;
           }
           else{
               return false;
           }
        }
        return false;
    }

    public int minTimeToCookPratas(int p, int[] cook, int n){

        int maxRank = -1;
        for(int i = 0; i < n; i++){
            if (cook[i] > maxRank ){
                maxRank = cook[i];
            }
        }

        int s = 0;
        int e = maxRank * (p * (p+1)/2);
        int ans = -1;

        while(s<=e){
           int mid = s + (e-s)/2;
           if(isValidans(p, cook, n, mid)){
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
