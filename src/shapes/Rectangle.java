package shapes;

public class Rectangle {
//protected properties for both length and width
    protected int length;
    protected int width;
//constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
//getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
//Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values
    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}

