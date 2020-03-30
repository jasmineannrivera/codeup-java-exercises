import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class ArrayLec {
    // Let's have some fun with arrays!

    public static void main(String[] args) {

        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        int[] numbers;
        numbers = new int[9];
        //       2. Declare a String array called words with a length of 10
        String[] words = new String[10];
        //       3. Initialize an int array called temps with the 'array initializer syntax'
        int[] temps = {34, 31, 56, 89, 75}; //array length = 5;
        Arrays.sort(temps);
        for (int temp : temps) {
            System.out.println(temp);
        }



        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
//        for (int i = 0; i < temps.length; i++) {
//            System.out.println(temps[i]);
//        }
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        for (int temp : temps) {
            System.out.println(temp);
        }
        //       3. Re-assign the third element with a temp of 38
        temps[2] = 38;
        System.out.printf("updated third temp: %d\n", temps[2]);
        //       4. Print "Updated third temp: 38" to the console, using printf


        // TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
        String[] horns = {"Yamaha", "Conn", "Schmid", "Holton"};
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"
        Random rand = new Random();
        int randInt = rand.nextInt(horns.length); //gives num between 0 and horns.length
        System.out.println(horns[randInt] + " is the best manufacturer");




        /* ***************   ******** ********************* */
        /* ********* **** THE ARRAYS CLASS **** *********** */
        /* **************** 2D ARRAYS ********************* */
        /* ***************   ******** ********************* */

        // TODO: 1. Create an 'Instructor' class that stores an instructor's
        //           -- firstName
        //           -- lastName
        //           -- brainWaveFrequency
        //        -- Also, keep a count of the total number of instructors
        //       2. Print to the console when an instructor has been created
        //       3. Create Getters and Setters for names / brainwavefreq
        //       4. Create a method to display instructor stats
        //       5. Initialize an array full of instructor objects
        //       6. Instantiate three instructors (casey,vivian,trant)
        //       7. Set each instructor's BrainWaveFrequency
        //       8. Add those instructors in the Instructor object array
        //       9. Iterate through the Instructor object array, and display each instructor's stats
        //       10. Create an array with only first names in it, and display it to the console
        //       11. Sum the brainwave frequencies, and display the total to the console
        //       12. Sum the brainwave frequencies, and display the total to the console
        //       13. Create a 2D array, and print it to the console, in grid form

        // define num of fortuna instructors as constant
        final int FORTUNA_TEAM = 3;

        //assign length to array to hold instruct. team
        Instructor[] team = new Instructor[FORTUNA_TEAM];
        //we now have an array with a length of three that holds instruc objs

        //create instructor obj for array
        Instructor casey = new Instructor("Casey", "Friday");
        Instructor vivian = new Instructor("Vivian", "Canales");
        Instructor trant = new Instructor("Trant", "Batey");
        //set brainwaves
        casey.setBrainWaveFrequency(5500);
        vivian.setBrainWaveFrequency(5800);
        trant.setBrainWaveFrequency(2);

        // put them in the array
        team[0] = casey;
        team[1] = vivian;
        team[2] = trant;

        //Now team array has 3 instructors in it

        // iterate through each instructor to display stats
        for(Instructor instructor : team) {
            System.out.println(instructor.displayStats());
        }
        System.out.println(); //keep it clean

        //creat array with only first names of instructors
        String[] firstNames = new String[team.length];
        for(int i = 0; i < team.length; i++) {
            firstNames[i] = team[i].getFirstName();
        }
        for(String firstName : firstNames) {
            System.out.println("\t" +firstName);
        }
        // overwrite all elements in the firstNAmes array to haxx0rz
        Arrays.fill(firstNames, "haXX0rz");
        for(String name : firstNames) {
            System.out.println("\t" + name);
        }
        System.out.println(Arrays.toString(firstNames));
        System.out.println();

        // sum of all freqs
        int freqSum = 0;

        for (Instructor instructor : team) {
            freqSum += instructor.getBrainWaveFrequency();
        }
        System.out.printf("\t total brainpower: %d MHz\n", freqSum/1000);


    }

}
