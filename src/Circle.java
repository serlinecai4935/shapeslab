public class Circle extends shapes
{
    //Ben
    private int radius;
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
}
