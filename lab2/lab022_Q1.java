  import java.util.Scanner;



public class lab022_Q1
{ 

 public static void main(String[] args)
{
    //Read the radius of circle

    Scanner circle = new Scanner (System.in);
    System.out.print("Enter the radius of the circle:");
    double radiusOfCircle = circle.nextDouble();

    //Calculations
    double circleArea = radiusOfCircle * radiusOfCircle * Math.PI ;
    double circleCircumference = 2* Math.PI * radiusOfCircle;


    //Outputs

    System.out.printf("The area of the circle is : %.3f%n",circleArea);
    System.out.printf("The circumference of the circle is : %.3f%n",circleCircumference);

    circle.close();
} 
    
}