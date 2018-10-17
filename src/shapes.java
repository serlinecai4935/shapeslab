 public abstract class shapes {
    private String type;

        public shapes(String type)
        {
            this.type =type;
        }

        public abstract double getArea();

        public abstract double getPerimeter();

        public String toString()
        {
            return "I am a " + type + " . ";
        }
    }
}

