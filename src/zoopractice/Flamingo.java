package zoopractice;

public class Flamingo extends Bird implements Flyable {

    public Flamingo(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Mingo flying high...");
    }
}
