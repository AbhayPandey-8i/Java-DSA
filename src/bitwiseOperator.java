public class bitwiseOperator {
    static void main() {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b); //AND
//        System.out.println(a | b); //OR
//        System.out.println(a ^ b); //XOR
//        System.out.println(~a);
//
//        int n = 5; (x2 -----)
//        for (int i = 1; i <=32 ; i++) {
//            n = n << 1;  //left shift
//            System.out.println(n);
//            System.out.println();
//        }
//
//        int n = 100; //(  /2 -------)
//        for (int i = 1; i <=32 ; i++) {
//            n = n >> 1; //right shift
//            System.out.println(n);
//            System.out.println();
//        }


        //finding even no
//        int n = 11;
//        if ((n&1)== 0){
//            System.out.println("Even");
//        } else{
//            System.out.println("Odd");
//        }

//        int n = 5;
//        int count = 0;
//        while(n!=0){
//            if ((n&1) !=0 ){
//                count++;
//            }
//            n = n >> 1;
//        }
//        System.out.println( "set bit count: " + count);

        int n = 15;
        if ((n&(n-1)) == 0 ){
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }

    }
}
