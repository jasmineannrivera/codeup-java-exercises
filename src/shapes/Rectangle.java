package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }


    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
       return length * width;
    }
}











////protected properties for both length and width
//    protected int length;
//    protected int width;
////constructor
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
////getters and setters
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
////Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
