//
//
//public class Person {
//    // private name properties that are strings
//    private String firstName;
//    private String lastName;
//
//    // create a setter constructor method
//    public Person(String firstName, String lastName) {
//        //this refers to the current instance
//        this.firstName = firstName;
//        this.lastName = lastName;
//        System.out.println("prints because constructor is called when an instance is made");
//    }
//
//    // get first name method/ constructor method
//    public String getFirstName() {
//        return firstName;
//
//    }
//    //Change or set the first name property to the passed value
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//
//    //get last name method/ constructor method
//    public String getLastName() {
//        return lastName;
//    }
//    //Change or set the last name property to the passed value
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    // prints a message to the console using the person's name
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }
////    Create a main method on the class that creates a new Person object (instance) and tests the above methods.
//    public static void main(String[] args) {
//        //constructor method is called (new)
//        Person me = new Person("jasmine", "rivera");
//        System.out.println(me.sayHello());
//
//        Person person1 = new Person("John", "Doe");
//        Person person2 = person1;
//        System.out.println(person1.getFirstName());
//        System.out.println(person2.getFirstName());
//        person2.setFirstName("Jane");
//        System.out.println(person1.getFirstName());
//        System.out.println(person2.getFirstName());
//
//    }







import java.util.Scanner;

public class Person {
    private String name;

    //methods ---------------------

    public Person (String name) {
        this.name = name;
    }
    //returns person's name
    public String getName() {
        return name;
    }

    //changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    //prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("\tHello, %s!\n", name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jasmine");
        person1.sayHello();

    }

}






