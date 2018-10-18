public class Runner
{
    public static void main(String[] args)
    {
        shapes shape1 = new Rectangle(5,5);
        System.out.println(shape1);
        System.out.println("My Perimeter is: " + shape1.getPerimeter());
        System.out.println("My Area is: " + shape1.getArea());

        shapes shape2 = new ETriangle(5);
        System.out.println(shape2);
        System.out.println("My Perimeter is: " + shape2.getPerimeter());
        System.out.println("My Area is: " + shape2.getArea());

        shapes shape3 = new Circle(5);
        System.out.println(shape3);
        System.out.println("My Perimeter is: " + shape3.getPerimeter());
        System.out.println( "My Area is: " + shape3.getArea());

        shapes[] shapes = {shape1,shape2,shape3};

        for (shapes cur: shapes)
        {
            System.out.println(cur);
            System.out.print("My area is: " + cur.getArea());
            System.out.print(" My Perimeter is: " + cur.getPerimeter());
        }
    }
}
