package Array_Problems.lec_33;

import java.util.ArrayList;
import java.util.List;

public class main {

    public List<Integer> rowsSum (int arr [] []) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;     //rows
        int n = arr[0].length;  //cols
        int sum = 0;

        for (int row = 0; row < m; row++) {
            sum = 0;
            for (int col = 0; col < n; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return new ArrayList<>();
    }

    public List<Integer> colsSum (int arr [] []) {
        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;

        for (int col = 0; col < n; col++) {
            sum = 0;

            for (int row = 0; row < n; row++) {
                int value = arr[col][row];
                sum = sum + value;
            }

        }
        return new ArrayList<>();
    }

    public List<Integer> wavePrintMatrix(int matrix [] [] , int m, int n){
         List<Integer> result = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            if ((col & 1) == 1 ){
                //bottom to top
                for (int row = m-1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            }
            else{
                //top to bottom
                for (int row = 0; row < m; row++) {
                    result.add(matrix[row][col]);
                }
            }
        }

      return result;
    }

    public int [][] transpose (int[][] matrix){

        if (matrix == null || matrix.length == 0){
          return new int [0][0];
        }

        

    }


    static void main() {

    }
}
