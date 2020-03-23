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
//        long i = 0;
//        do {
//            System.out.printf("\t%d\n", i);
//            i += 2;
//        } while (i < 101);
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
//        for (int i = 0; i < 101; ++i) {
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                if (i % 5 == 0) {
//                    System.out.print("Buzz");
//                }
//            } else if (i % 5 == 0) {
//                System.out.print("Buzz");
//            } else {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//
        String response = "";
        int num = 0;
        Scanner s = new Scanner(System.in);

        System.out.printf("\n\n\n");
        do {
            System.out.print("To what number do you want to go? (max 99) ");
            response = s.nextLine();
            try {
                num = Integer.parseInt(response);
            } catch (NumberFormatException nfe) {
                System.out.print("INVALID ENTRY: enter an integer ");
                response = "y";
                continue;
            }
            if (num > 99) {
                System.out.print("The maximum number is 99 ");
                response = "y";
                continue;
            }

            // print the table
            System.out.println("Here is your table!\n" +
                    "\n" +
                    "number | squared | cubed\n" +
                    "------ | ------- | -----");
            for (int i = 1; i <= num; i++) {
                System.out.printf("%-6d | %-6d | %-6d\n", i, i*i, i*i*i);
            }
            System.out.printf("\n\n\nWould you like to print another chart? ");
            response = s.nextLine();
            if (response == null) break;
            System.out.printf("\n");
        } while (response.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
    }













}







