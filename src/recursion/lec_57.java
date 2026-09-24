package recursion;

public class lec_57 {

    //Print name 10 times using recursion
    static void printMyName(int n) {
        if(n == 0){
            return;
        }
        System.out.println("Hello my name is abhay");

        printMyName(n-1);
    }

    //print 1 to n no. using recursion
    static void print1ToN (int n, int count){
        if(count > n){
            return;
        }

        System.out.println(count);
        count++;
        print1ToN(n, count);
    }

    //print n to 1 using recursion
    static void Nto1(int n, int count){
        count = n;
        if(count == 0){
            return;
        }

        System.out.println(count);
        n--;

        Nto1(n, count);
    }

    //print array using recursion
    static void printArray(int arr[], int i){
        int n = arr.length;


        if(i >= n){
            return;
        }

        System.out.println(arr[i]);


        printArray(arr, i+1);
    }


    //print maxElement using recursion
    static void maxElement(int [] arr, int i, int max){


        if(i >= arr.length){
            System.out.println(max);
            return;
        }

        if(arr[i] > max ){
            max = arr[i];
        }

        maxElement(arr, i+1, max );

    }

    //print minElement using recursion
    static void minElement(int [] arr, int i, int min){


        if(i >= arr.length){
            System.out.println(min);
            return;
        }

        if(arr[i] < min ){
            min = arr[i];
        }

        minElement(arr, i+1, min );

    }

    //Linear Search using recursion
    static void linearSearch(int [] arr, int target, int i, int found){
        if(i >= arr.length){
            System.out.println(found);
            return;
        }

        if(target == arr[i]){
            found = arr[i];
        }

        linearSearch(arr, target, i+1, found);
    }

    //count element of array using recursion
    static void totalElements (int arr[], int i, int count){
        if(i >= arr.length){
            System.out.println(count+1);
            return;
        }

        count = i;

        totalElements(arr, i+1, count);
    }

    //count Target element of array using recursion
    static void targetElements (int arr[], int i, int count, int target){
        if(i >= arr.length){
            System.out.println(count);
            return;
        }

        if(arr[i] == target){
            count++;
        }

        targetElements(arr, i+1, count, target);
    }

    //print digits of a num
    static void digits(int num){
        if(num == 0){
            return;
        }

        int digit = num % 10;
        num = num / 10;

        digits(num);
        System.out.println(digit);

    }




    public static void main(String[] args) {
//        printMyName(10);
//          print1ToN(5, 1);
//        Nto1(5, 5);
        int arr [] = {10, 20, 10, 40, 10, 60, 70, 80};
//        int i = 0;
//        printArray(arr, i);
//        int i = 0;
//        int min = Integer.MAX_VALUE;
//        minElement(arr, i, min);
//        int target = 40;
//        int i = 0;
//        int found = 0;
//        linearSearch(arr, target, i, found);
//        int i = 0;
//        int count = 0;
//        int target = 10;
//        targetElements(arr, i, count, target);
        int num = 137;
          digits(num);
    }

}
