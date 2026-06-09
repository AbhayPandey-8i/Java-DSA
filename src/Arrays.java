import java.util.Scanner;

public class Arrays {
    static void main() {

        //2-D arrays

        int arr[][] ={ {1,2,3} , {1,2,3} };
        int sum = 0;

        for (int i = 0; i <=arr.length-1 ; i++) {
            for (int j = 0; j <=arr[i].length-1 ; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
        }
        System.out.println(sum);


//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i <=arr.length-1 ; i++) {
//            for (int j = 0; j <=arr[i].length-1 ; j++) {
//                System.out.print("Provide value for row=" + i + ", and col=" + j);
//                arr[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }


//        int [] [] brr = {
//                {1,2},
//                {2,3,4,5},
//                {3,4,4,5,6},
//                {4,5},
//        };
//
//        int rowLength = brr.length;
//
//
//        for (int rowIndex = 0; rowIndex <= rowLength-1 ; rowIndex++) {
//            int colLength = brr[rowIndex].length;
//            for (int colIndex = 0; colIndex <= colLength-1 ; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex]);
//            }
//            System.out.println();
//        }

//        int [] [] brr = {
//                {1,2},
//                {2,3},
//                {3,4},
//                {4,5},
//        };
//
//        int rowLength = brr.length;
//        int colLength = brr[0].length;
//
//        for (int rowIndex = 0; rowIndex <= rowLength-1 ; rowIndex++) {
//            for (int colIndex = 0; colIndex <= colLength-1 ; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex]);
//            }
//            System.out.println();
//        }



        //1-D Arrays
//        int arr[] = {3,2,-5,21,10};
//        int minValue = arr[0];
//        int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//            if (arr[i] < minValue) {
//                minValue = arr[i];
//            }
//        }
//
//        System.out.println(minValue);

//        int arr[] = {4,2,-5,21,15};
//        int maxValue = arr[0];
//        int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//           if (arr[i] > maxValue) {
//                  maxValue = arr[i];
//           }
//        }
//
//        System.out.println(maxValue);

//        int arr[] = {2,3,10,20};
//        int mul = 1;
//        int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//            int value = arr[i];
//            mul = mul * value;
//        }
//        System.out.println(mul);

//        int arr[] = {10,20,30,40,50};
//        int sum = 0;
//        int n = arr.length;
//
//        for (int i = 0; i <=n-1 ; i++) {
//            int value = arr[i];
//            sum = sum + value;
//        }
//
//        System.out.println(sum);

//        int arr[] = {12, 14, 1245};
//        int n = arr.length;
//        //for loop
//        for (int i = 0; i <=n-1 ; i++) {
//            System.out.println(arr[i]);
//        }

//        int arr[] = new int[5];
//        //taking array input
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i = 0; i <=n-1 ; i++) {
//            System.out.println("Enter input for your index:" + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //for each loop
//        for (int val:arr){
//            System.out.println(val);
//        }



//        //declaration
//        int arr [];
//        //allocation
//        arr = new int [5];
//        //init
//        int brr[] = {10,20,30};
//
//        //using for each loop
//        int n = brr.length;
//
//        for (int val: brr){
//            System.out.println(val);
//        }
//

        //using for loop
//        int n = brr.length;
//        for (int index = 0; index <=n-1 ; index++) {
//            System.out.println(brr[index]);
//        }


//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);
    }
}
