public class Circle extends shapes
{
    //Circle extends from main class shapes
    private int radius;
    // Field defines radius
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    //Constructor initializes value of radius for Circle
    // Gives area of the circle
    public double getArea() {
        return 3.14 * radius * radius;
    }
    // Gives perimeter/circumference of the circle
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
}
