public class Rectangle {
    private double length;
    private  double width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea()
    {
        return (length*width);
    }
}
