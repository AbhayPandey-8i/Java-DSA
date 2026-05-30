public class DataTypes {
    static void main() {

        //Numeric Datatypes = byte short int long

        byte num1 = 125;  // byte can only store value from -128 to 127
        System.out.println(num1);

        short num2 = 32767; // range is -32768 to 32767
        System.out.println(num2);

        int num3 = 40000;
        long num4 = 1234567567;
        System.out.println(num3);
        System.out.println(num4);


        //Floating DT
        float num5 = 3.142578f;
        System.out.println(num5);

        double num6 = 3.123456756845;
        System.out.println(num6);

        //Other  - Char, boolean
        boolean EligibleToVote = true;
        System.out.println(EligibleToVote);

        char firstCharacter = 'a';
        System.out.println((char) (firstCharacter + 2));

        //implicit conversion
        byte num7 = 17;
        long num8 = num7;
        System.out.println(num8);

        //explicit conversion
        long val1 = 123456789;
        int val2 = (int)val1;
        System.out.println(val2);


    }
}
