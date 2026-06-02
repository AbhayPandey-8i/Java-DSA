public class Loops {
    static void main() {
        //For Loop
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);

            for (int j = 0; j < 6; j++) {
                System.out.println("Tutorial on loops" + j);

                for (int k = 1; k <= 10; k += 4) {
                    System.out.println(k);

                }
            }
        }

        //Nested for loop
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print("*");
            }
            System.out.println(); //for moving to next line

            for (int j = 1; j <=3 ; j++) {
                for (int k = 1; k <=3 ; k++) {
                    System.out.println("j =" + j + ",k = " + k);
                }

            }
        }

        //While Loop
        int i = 1;
        while (i<=5){
            System.out.println("Count" + i);
            i++;
        }

        //Nested While Loop
        int x = 1;
        while (x <= 3) {
            int j = 1;
            while (j<=3){
                System.out.println("x = " + x + ", j = " + j);
                j++;
            }
            x++;
        }

        //Do While loop
        int y = 1;
        do {
            System.out.println("Loop Runs");
            y++;
        } while (y<=3);


    }
}
