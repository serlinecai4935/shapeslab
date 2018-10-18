 public abstract class shapes {
     private String type;
     // Field type

     public shapes(String type) {
         this.type = type;
     }
     // Constructor type

     public abstract double getArea();
     // Method to get Area

     public abstract double getPerimeter();

     // Method to get Perimeter
     // Returns type of shape
     public String toString() {
         return "I am a " + type + " . ";
     }
 }

