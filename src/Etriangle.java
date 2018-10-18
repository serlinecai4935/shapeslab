
        public class Etriangle extends Shape
        {
            private int side;

            public Etriangle (int side)
            {
                super("Etriangle");
                this.side = side;
            }
            @Override
            public double getArea()
            {
                return (Math.sqrt(3)/4)*(side * side);
            }
            @Override
            public double getPerimeter()
            {
                return side * 3;
            }
        }


