public class Operators {
    static void main() {


        //Arithmetic Operators --
        System.out.println("Arithmetic Operators");
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 4;
        int remainder = solvedThisWeek % 7;


        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);


        //Relational Operator
        System.out.println("Relational Operators");

        int currenStreak = 45;
        int targetStreak = 50;

        System.out.println(currenStreak == targetStreak);
        System.out.println(currenStreak != targetStreak);
        System.out.println(currenStreak > targetStreak);
        System.out.println(currenStreak < targetStreak);
        System.out.println(currenStreak <= targetStreak);
        System.out.println(currenStreak >= targetStreak);

        //Logical Operators
        System.out.println("Logical Operators");

        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        //Assignment Operators
        System.out.println("Assigment Operators");

        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
        System.out.println(ratingPoints);
        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
        System.out.println(ratingPoints);
        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
        System.out.println(ratingPoints);
        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
        System.out.println(ratingPoints);
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
        System.out.println(ratingPoints);

        //Unary Operators
        System.out.println("Unary Operators");

        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);



    }

}
