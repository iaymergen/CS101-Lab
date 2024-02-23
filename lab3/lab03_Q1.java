import java.util.Scanner;

public class lab03_Q1 

{  public static void main(String[] args)
    
{   
    // inputs
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your weight in kilograms:");
    double weight = in.nextDouble();
    System.out.print("Enter your height in meters:");
    double height = in.nextDouble();
     

    // calculations
    double bodyMassIndex = (weight/(height*height));

    // results

    if ( bodyMassIndex<18.5)
    {
        System.out.printf("Your BMI is %.2f and you are in the category of underweight.%n",bodyMassIndex);
    }  

    else if  (bodyMassIndex<25 ) 

    {
        System.out.printf("Your BMI is %.2f and you are in the category of healthy.%n",bodyMassIndex);

    }
    else if  (bodyMassIndex <30)
    {
        System.out.printf("Your BMI is %.2f and you are in the category of overweight.%n",bodyMassIndex);
    }
    else if  (30 <= bodyMassIndex)
    {
        System.out.printf("Your BMI is %.2f and you are in the category of underweight.%n",bodyMassIndex);
    }
     

     in.close();


} 


    
}