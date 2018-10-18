public class Rectangle extends Shape
    //defines the height and width sides of the rectangle
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
    //getPerimeter multiplies the height and width together to find the area of the rectangle
    public double getArea()
    {
        return (width * height);
    }

    @Override
    // getPerimeter adds each height and width together to find the perimeter of the rectangle
    public double getPerimeter()
    {
        return (height + height + width + width);
    }
}
