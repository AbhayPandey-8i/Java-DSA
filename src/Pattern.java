public class Pattern {
    static void main() {

// Q1
//        int n = 4;
//
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=n ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Q2
//        int a = 3;
//        int b = 5;
//        for (int row = 1; row <=a ; row++) {
//            for (int col = 1; col <=b ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Q3
//          int n = 5;
//
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

//        int n = 5;
//
//        for (int row = 1; row <=n ; row++) {
//
//            //spaces print
//            for (int col = 1; col <= n-row ; col++) {
//                System.out.print("  ");
//            }
//            //star print
//            for (int col = 1; col <=n ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//        int n = 5;
//
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <= n-row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//
//        for (int row = 1; row <=5 ; row++) {
//            //space
//            for (int col = 0; col <= n-row ; col++) {
//                System.out.print("  ");
//            }
//            //star
//            for (int col = 1; col<=2*row-1  ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 4;
//        for (int row = 1; row <=n ; row++) {
//            //space
//            for (int col = 1; col <= row-1 ; col++) {
//                System.out.print("  ");
//            }
//            //star
//            for (int col = 1; col <=2*n-2*row+1 ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            //space
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1) {
//                        System.out.print("* ");
//                    } else if (col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//
//                }
//
//
//            }
//            System.out.println();
//        }

//        int n = 10;
//        for (int row = 1; row <= n; row++) {
//
//            if (row == 1 || row == 2 || row == n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//
//                }
//            } else {
//                System.out.print("* ");
//                for (int col = 1; col <= (row - 2); col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//
//
//            System.out.println();
//
//        }

//        int n = 5;
//        for (int row = 1; row <=5 ; row++) {
//
//            //P1
//            for (int col = 1; col <=n-row ; col++) {
//                System.out.print("  ");
//            }
//
//
//            //P2
//            if ( row == 1 || row == n) {
//                for (int col = 1; col <= 2 * row - 1; col++) {
//                    System.out.print("* ");
//                }
//            }
//
//                else {
//                    System.out.print("* ");
//
//                    for (int col = 1; col <= 2*row-3 ; col++) {
//                        System.out.print("  ");
//
//                    }
//
//                    System.out.print("* ");
//                }
//
//
//
//            System.out.println();
//        }

//       int n = 5;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }


        int n = 5;
        int count = 1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}