public class Earth {

    public static void main(String[] args) {

        Human tom;
        tom = new Human();
        tom.age = 50;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsaba";

        tom.speak();
        System.out.println();

        Human joe = new Human();
        joe.age = 40;
        joe.eyeColor = "green";
        joe.heightInInches = 74;
        joe.name = "Joe Helena";

        joe.speak();
        System.out.println();
    }
}
