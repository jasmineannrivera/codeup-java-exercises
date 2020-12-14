package zoopractice;
public class Zoo {

    public static void moveAnimals(Animal animal){
        animal.move();
    }

    public static void main(String[] args) {

//        Animal giraffe = new Animal(5, "male", 3000);
//        giraffe.eat();

        Bird macaw = new Bird(30, "female", 4);
        macaw.eat();
        macaw.sleep();

        Animal flamingo = new Flamingo(1, "male", 4);
        flamingo.move();
//        flamingo.fly();

        Animal coelacanth = new Fish(43, "male", 198);
//        coelacanth.swim();
        coelacanth.sleep();
        coelacanth.eat();
        coelacanth.move();

        moveAnimals(coelacanth);
        moveAnimals(flamingo);

        Chicken silkie = new Chicken(2, "female", 3);
        silkie.eat();





    }

}
