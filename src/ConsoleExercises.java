import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//        Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        //import scanner class to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        int number = input.nextInt();

        System.out.println(number);


//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.println("Please enter three words");

        String firstWord = input.next();

        String secondWord = input.next();

        String thirdWord = input.next();

        System.out.printf("\n The words are \"%s\", \"%s\", and \"%s\".\n", firstWord, secondWord, thirdWord);


//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.print("\nEnter a sentence: ");

        input.useDelimiter("\n");

        String sentence = input.next();

        input.nextLine();

        System.out.printf("\nThe sentence is \"%s\"\n", sentence);


//        Prompt the user to enter values of length and width of a classroom at Codeup.

        System.out.print("Enter width of the classroom (or your bedroom): ");

        String sWidth = input.nextLine();

        double width = Double.parseDouble(sWidth);

        System.out.print("Now enter the length: ");

        String sLength = input.nextLine();

        double length = Double.parseDouble(sLength);
        System.out.printf("The dimensions of the classroom are %.2f by %.2f. The perimeter is %.2f and the area is %.2f.\n",
                length, width, 2*(length+width), length*width);









    }
}
