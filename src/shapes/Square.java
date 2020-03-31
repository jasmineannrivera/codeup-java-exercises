package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    void setLength(double length) {
        super.length = length;
        super.width = length;

    }

    @Override
    void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return (super.width * super.width);
    }
}






//    protected int side;
//    //constructor that calls Rectangle's constructor and sets length and width to side
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }
//
//    @Override
//    public int getArea() {
//        return (side * side);
//    }


