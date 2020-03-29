public class Instructor {

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String first, String last) { //constructor
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("\t%s was just created\n", firstName);
        System.out.printf("\tInstructor count: %d\n\n", numInstructors);
    }

    //Getter and Setter for First Name and last names
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }


    //getter and setter for brain
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq) {
        this.brainWaveFrequency = brainWaveFreq;
    }

    //Method to display instructor info
    public String displayStats() {
        return String.format("\t%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFrequency);
    }

    //in use


}
