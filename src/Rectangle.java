public class Rectangle extends Shape
{
    private int width;
    private int height;
    public Rectangle (int width,int height)
    {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea()
    {
        return (width * height);
    }

    @Override
    public double getPerimeter()
    {
        return (height + height + width + width);
    }
}
