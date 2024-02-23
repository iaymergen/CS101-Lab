import java.util.Scanner;

    
public class Lab02_Q1
{

     public static void main(String[] args) 
    {
        //Read width of rectangle
        Scanner rectangle = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle:");
        double widthOfRectangle = rectangle.nextDouble();

        // Read height of rectangle 

        
         System.out.print("Enter the height of the rectangle: ");
         double heightOfRectangle = rectangle.nextDouble();

         // Compute area
         double areaOfRectangle = heightOfRectangle * widthOfRectangle ;

         // Compute circumference 
         double circumferenceOfRectangle = (heightOfRectangle + widthOfRectangle) *2 ;

         // Compute diagonal 
         double diagonalOfRectangle = Math.sqrt((Math.pow(heightOfRectangle, 2)+Math.pow(widthOfRectangle, 2)));

         System.out.printf("The area of the rectangle is           : %13.3f%n", areaOfRectangle);
         System.out.printf("The circumference of the rectangle is  :%14.3f%n", circumferenceOfRectangle);
         System.out.printf("The diagonal of the rectangle is       :%14.3f%n", diagonalOfRectangle);

         rectangle.close();
         
        }
    

    }   

