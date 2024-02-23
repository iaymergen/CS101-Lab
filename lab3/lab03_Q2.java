import java.util.Scanner;

public class lab03_Q2 
{
     public static void main(String[] args) 
     
 {
     //input year
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the year to be evaluated:");
     int year = in.nextInt();

     // century calculation
      int century = (((year-1)/100)+1);
      int lastDigit = (century%10);
      String endNumber = "";
      
      if (century== 11)
      {
          endNumber="th";
      }
      else if (century==12)
      {
          endNumber="th";
      }
     else if (century==13)
      {
          endNumber="th";
      }
      else 
      {
      if (lastDigit==1)  
      {
          endNumber= "st";
      }
      else if (lastDigit==2)
      {
          endNumber = "nd";
      }
      else if(lastDigit==3)
      {
          endNumber= "rd";
      }
      else 
      {
          endNumber = "th";
      }
    }
     
      //leap year decision
      String leapYear = "";
      if (year%4==0)
      {
         if (year%100==0)
         {
           if (year%400==0)
           {
             leapYear=" a leap year";
           }
           else 
           leapYear="not a leap year";
         }
         else 
         {
             leapYear = " a leap year";
         }

      }
      else 
      {
        leapYear = "not a leap year";

      }
      // output
      System.out.println("The year "+year+" is in the "+century+endNumber+" century and is "+leapYear);
     
      in.close();

 }
}