package zoopractice;
public class Fish extends Animal {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("The fish is flipping its fins...");
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
