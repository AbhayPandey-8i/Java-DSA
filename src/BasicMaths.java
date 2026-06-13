public class BasicMaths {

    static int sumDigits(int num) {
//        while(num != 0){
//            int digit = num%10;
//            System.out.println(digit);
//            num = num/10;
//        }

//       int count = 0;
//
//        while(num != 0){
//
//            int digit = num%10;
//            count++;
//            num = num/10;
//        }
//        return count;
//    }

        int sum = 0;

        while (num != 0) {

            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    static int reverseNum(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);
        if (originalNum == reversedNum) {
            System.out.println("It is a palindrome");
            return true;
        } else {
            System.out.println("It is not a palindrome");
            return false;
        }

    }

    static boolean isPrimeOrNot(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime no.");
                return false; 
            }
        }
            System.out.println("is a prime no.");
            return true;

    }


    static int getGCD (int a, int b){
        while (b!=0){
            int oldvalofb = b;
            b = a%b;
            a = oldvalofb;
        }
        int ans = a;
        return ans;
    }

    static int getLCM (int a , int b){
        int GCD = getGCD(a,b);
        int prod = a*b;
        int lcm = prod/GCD;
        return lcm;
    }


    static void main() {
        int result = getLCM(18, 12);
        System.out.println(result);
//            int num = 1234;
//         int rev = reverseNum(num);
//        System.out.println(rev);

//            printDigits(num);
    }
}
