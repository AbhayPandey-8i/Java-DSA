import java.util.Scanner;

public class Conditionals {
    static void main() {

        //If Statement
        int dailyPractice = 12;

        if (dailyPractice > 10) ;
        System.out.println("Keep it up");


        //If Else Statement
        int score = 99;

        if (score > 100) {
            System.out.println("Score is above 100");
        } else {
            System.out.println("Score is below 100");
        }

        //If Else If ladder
        int accuracy = 70;

        if (accuracy > 90) {
            System.out.println("Excellent Accuracy");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Could be better");
        }

        //Nested If else statement
        int age = 12;
        char gender = 'M';

        if (gender == 'M') {
            System.out.println("You are male");

            if (age > 18) {
                System.out.println("You are male and can vote");
            } else {
                System.out.println("You are male and cannot vote");
            }
        } else {
            System.out.println("You are not male");
            if (age > 18) {
                System.out.println("You are not male and can eligible to vote");
            } else {
                System.out.println("You are not male and cannot vote");
            }
        }

        //Ternary Operator
        int streakDays = 30;

        String streak = (streakDays > 25) ? "Keep it up" : "Do More Hardwork";
        System.out.println(streak);

        //Switch statement
        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thurs");
                break;

            case 5:
                System.out.println("Fri");
                break;


            default:
                System.out.println("Holiday");
        }
    }
}
