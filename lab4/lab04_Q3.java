import java.util.Scanner;

public class lab04_Q3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = in.nextInt();
        System.out.printf("Now input %d positive integers:%n",n);
        
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;
        double sum= 0 ;
        double average;
        int i = 0;
        
        while (i<n)
        {
          
           int newNumber = in.nextInt();
           
          if( newNumber>max) // finding max
          {
            max  = newNumber; 
          }
          if(newNumber<min) // finding min
          {
             min = newNumber;
          }
          if(sum>=0) // finding sum
          {
            sum = sum + newNumber;
          }
          i++;
          
          if(i==n) // outputs
          {
            average = sum/n;
          System.out.printf("Max:%d%n",max);
          System.out.printf("Min:%d%n",min);
          System.out.printf("Average:%.1f",average);
          } 
        
        }
        in.close();
    } 
    

    
}