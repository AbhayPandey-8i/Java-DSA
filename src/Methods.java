public class Methods {

    static void print2kaTabel () {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("=>" + ans);
        }
    }

        static void printSum(int x, int y) {
            System.out.println("SUM:" + (x+y));
        }
//
//        static int add (int a, int b){
//            int sum = a+b;
//            return sum;
//        }

        static int add (int a, int b, int c) {
            int sum = a + b + c;
            return sum;
        }

        static void printWelcomeMessage () {
            System.out.println("Welcome To java");
        }

        static  int addition (int a, int b) {
        int sum = a+b;
        return sum;
        }




    static void main() {

        System.out.println("here is your sum");
      int result =  addition(10,60);
        System.out.println(result);

//        System.out.println("Here is your greeting");
//        printWelcomeMessage();

//      int ans1 = add(5,10);
//      int ans2 = add(5,10,20);
//        System.out.println(ans1);
//        System.out.println(ans2);

//        System.out.println("Here is your sum");
//        printSum( 5,3 );
//
//        System.out.println("Here is your add");
//

    }
//        System.out.println("Here is your table");
//        print2kaTabel();
//        System.out.println("Happy coding");
//    }


}
