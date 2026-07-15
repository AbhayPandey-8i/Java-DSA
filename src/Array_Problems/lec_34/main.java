package Array_Problems.lec_34;

import java.util.ArrayList;
import java.util.List;

public class main {

    public void rotate90clockwise(int [][] matrix, int N){
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int row = 0; row < N; row++) {
            int startCol = 0;
            int endCol = N-1;
            while (startCol < endCol){
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }

        }
    }

    //Spiral print of matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow <= endingRow && startingCol <= endingCol){
            // row wise left to right -> startingRow print krni h, from startCol o endCol
            for(int col = startingCol; col <= endingCol; col++){
                res.add(matrix[startingRow][col]);
            }
            startingRow++;
            // col wise top to bottom -> endingCol print krna h, from startingRow o endingRow
            for(int row = startingRow; row <= endingRow; row++){
                res.add(matrix[row][endingCol]);
            }
            endingCol--;
            // row wise right to left -> endingRow print krni h, from endingCol o startingCol
            //valid ending row -> startingRow <= endingRow
            if(startingRow <= endingRow){
                for(int col = endingCol; col >= startingCol; col--){
                    res.add(matrix[endingRow][col]);
                }
            }
            endingRow--;
            // col wise bottom to top -> startingCol print krna h, from endingRow to startingRow
            //valid starting col
            if(startingCol <= endingCol){
                for(int row = endingRow; row >= startingRow; row--){
                    res.add(matrix[row][startingCol]);
                }
            }
            startingCol++;
        }
        return res;
    }


    static void main() {

    }

}
