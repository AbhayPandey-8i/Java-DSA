import java.math.BigInteger;
import java.util.Scanner;

public class takingInput {
    static void main(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of firstNum");
        int firstNum =  sc.nextInt();
        System.out.println("Enter Value of secondNum");
        int secondNum = sc.nextInt();

        int ans = firstNum+secondNum;

        System.out.println( "Answer is:" + ans);


        System.out.println("enter big interger value");
        BigInteger bg = sc.nextBigInteger();
        System.out.println( "BigInteger is:" + bg);

        System.out.println("enter boolean value");
        boolean flag = sc.nextBoolean();
        System.out.println( "Boolean is :" + flag);
    }
}
