package shapes;

public class Square extends Rectangle {
    protected int side;
    //constructor that calls Rectangle's constructor and sets length and width to side
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return (side * side);
    }


}

