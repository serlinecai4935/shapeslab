public class Etriangle {
//    public static void main(String[]args)

        public class Etriangle extends shapes
        {
            private int side;

            public Etriangle (int side)
            {
                super(type: "Etriangle");
                this.side = side;
            }
            public double getArea()
            {
                return (Math.sqrt(3)/4)*(side * side);
            }
            public double getPerimeter()
            {
                return side * 3;
            }
        }

}
