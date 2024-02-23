import java.util.Scanner;

public class lab04_Q3revision 


{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Please input n:");
       int n = in.nextInt();
       
       
       int min = Integer.MAX_VALUE ;
       int max = Integer.MIN_VALUE;
       double sum= 0 ;
       double average;
       int check = 0;

         int devide = 0;
         while(check!=n)
         {
           System.out.print("Please input a positive integer:");
           int newNumber = in.nextInt();
           check = newNumber;
           if(newNumber==n)
          {
            average = sum/devide;
            System.out.printf("Max:%d%n",max);
            System.out.printf("Min:%d%n",min);
            System.out.printf("Average:%.1f%n",average);
            
          }
          
          if( newNumber>max) // finding max
          {
             max  = newNumber; 
          }
          if(newNumber<min) // finding min
          {
             min = newNumber;
          }
          if(sum>=0)
          {
             sum = sum + newNumber;
          }
          devide++;
          
         }
        
      in.close();
    } 
    
}
