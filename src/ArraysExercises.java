import java.util.Arrays;

public class ArraysExercises {
    // Create a static method named addPerson. It should
    //    public static void displayMenu() {
    //        String menu = "What would you like to do?\n" +
    //                "\n" +
    //                "0 - exit\n" +
    //                "1 - view all movies\n" +
    //                "2 - view movies in the animated category\n" +
    //                "3 - view movies in the drama category\n" +
    //                "4 - view movies in the horror category\n" +
    //                "5 - view movies in the scifi category";
    //        System.out.println(menu);
    //    } accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson (Person[] personArray, Person newPerson){
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);
        newArray[3] = new Person(newPerson.getName());
        return newArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] people = {
                new Person("Andre"),
                new Person("Jasmine"),
                new Person("Serena")
        };

        for (Person person : people) {
            System.out.println(person.getName());
        }
        // Iterating through people and adding another
        for (Person person : addPerson(people, new Person("Patricia"))){
            System.out.println(person.getName());
        }


    }
}
