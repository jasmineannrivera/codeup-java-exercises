import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }



//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.


//        long i = 2;
//        do {
//            System.out.printf("\t%d\n", i);
//            i *= i;
//        } while (i < 1000000000);
//        System.out.print("\n");

//        Alter your loop to count backwards by 5's from 100 to -10.

//        long i = 100;
//        do {
//            System.out.printf("\t%d\n", i);
//            i -= 5;
//        } while (i > -11);
//        System.out.print("\n");

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2;
//        do {
//            System.out.printf("\t%d\n", i);
//            i *= i;
//        } while (i < 1000001);
//        System.out.print("\n\n");


//        Refactor the previous two exercises to use a for loop instead.
//        for (int i = 5; i < 15; ++i) {
//            System.out.printf("%d\n", i);
//        }
//
//        for (int i = 0; i < 101; i += 2) {
//            System.out.printf("\t%d\n", i);
//        }
//
//        for (int i = 100; i > -11; i -= 5) {
//            System.out.printf("\t%d\n", i);
//        }
//
//        for (long i = 2; i < 1000001; i *= i) {
//            System.out.printf("\t%d\n", i);
//        }


        //fizzbuzz
//
//        for (int i = 1; i < 101; ++i) {
//            if ( i % 15 ==0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//
//        }
//
        // Table of powers
        Scanner scanner = new Scanner(System.in);
        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i <= userInt; i++) {
                System.out.printf("%-6d", i);
                System.out.print(" | ");
                System.out.printf("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i);
                System.out.println();
            }
            System.out.println("Would you like to enter another number (y/n)?");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);
        System.out.println("goodbye!");



//
//        Scanner scanner = new Scanner(System.in);
//        boolean userContinues = true;
//
//        do {
//            System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//            int numericGrade = scanner.nextInt();
//
//            /*
//            A : 100 - 88
//            B : 87 - 80
//            C : 79 - 67
//            D : 66 - 60
//            F : 59 - 0
//             */
//            if(numericGrade >= 88) {
//                System.out.println("A");
//            } else if (numericGrade >= 80) {
//                System.out.println("B");
//            } else if (numericGrade >= 67) {
//                System.out.println("C");
//            } else if (numericGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter another grade (y/n)?");
//            String userResponse = scanner.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while(userContinues);


    }













}







