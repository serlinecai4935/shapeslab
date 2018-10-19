
        public class Etriangle extends shapes
        {
            // Etriangle extends from main class shapes
            private int side;
            // Field defines side
            public Etriangle (int side)
            {
                super("Etriangle");
                this.side = side;
            }
            //constructor initializes the side of the Etriangle
            //returns the area of Etriangle
            @Override
            public double getArea()
            {
                return (Math.sqrt(3)/(4))*(side * side);
            }
            //Returns the perimeter of the Etriangle
            @Override
            public double getPerimeter()
            {
                return side * 3;
            }
        }


