package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

//      myShape = new Rectangle(3,4);

        myShape = new Square(4);

        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        System.out.println("myShape.getArea() = " + myShape.getArea());

    }
}




//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
