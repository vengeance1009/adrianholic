//*****ADRIAN CAAMIÑO*****//

/*
 * The Circle class models a circle with a radius and color.
 */
import java.io.*;

public class Circle {  // Save as "Circle.java"
   // instance variable, not accessible from outside this class
   double radius;
   String color;
   static BufferedReader reader;


   
   // The default constructor with no argument.It sets the radius and color to their default value.
   public Circle()throws IOException {
     System.out.print("Please enter radius:");
	 radius = Double.parseDouble(reader.readLine());
	 System.out.print("Please enter color:");
	 color = reader.readLine();
   }
 
   // 2nd constructor with given radius, but color default
   public Circle(double r)throws IOException{
		radius = r;
		color = color;
   }
   
 
 // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
  
   // A public method for computing the area of circle
   public String getColor(){
      return color;
   }

public static void main(String[] args)throws IOException {
	reader = new BufferedReader(new InputStreamReader(System.in));
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor which sets its radius and color to their default value.
      
	Circle c1 = new Circle();
      
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle has radius of " + c1.getRadius() + " and its color is " + c1.getColor());
	  
   
      // Declare an instance of class circle called c2.
      // Construct the instance c2 by invoking the second constructor with the given radius and default color.

      Circle c2 = new Circle(2.0);
      
	// Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle has radius of " + c1.getRadius() + " and its color is " + c2.getColor());
	
   }
}