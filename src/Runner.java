public class Runner
{
    public static void main(String[] args)
    {
        shapes shape1 = new Rectangle(5,5);
        System.out.println(shape1);
        System.out.println("My Perimeter is: " + shape1.getPerimeter());
        System.out.println("My Area is: " + shape1.getArea());
        // Input width and height of rectangle
        // Prints out shape type
        // Prints out Perimeter of Rectangle
        // Prints out Area of Rectangle

        shapes shape2 = new Etriangle(5);
        System.out.println(shape2);
        System.out.println("My Perimeter is: " + shape2.getPerimeter());
        System.out.println("My Area is: " + shape2.getArea());
        // Input side length of Etriangle
        // Prints out shape type
        // Prints out Perimeter of Etriangle
        // Prints out Area of Etriangle


        shapes shape3 = new Circle(5);
        System.out.println(shape3);
        System.out.println("My Perimeter is: " + shape3.getPerimeter());
        System.out.println( "My Area is: " + shape3.getArea());
        // Input radius of circle
        // Prints out shape type
        // Prints out Perimeter of Circle
        // Prints out Area of Circle

        shapes[] shapes = {shape1,shape2,shape3};
        // Goes through array of shapes
        // For the values in class shapes, it prints out the area, perimeter and shape type
        for (shapes cur: shapes)
        {
            System.out.println(cur);
            System.out.print("My area is: " + cur.getArea());
            System.out.print(" My Perimeter is: " + cur.getPerimeter());
        }
    }
}
