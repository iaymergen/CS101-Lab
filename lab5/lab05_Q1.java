import java.util.Scanner; 

public class lab05_Q1 
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter city plan string:");
      String str = in.nextLine();
      int length = str.length();
      int l = length-1;
      int number = Integer.valueOf(str);
      int digit;
     

      System.out.println("City blueprint:");
      int max = Integer.MIN_VALUE;

      for(int j=0;j<=l;j++)
      {
         while(number>0)
         {
            digit = number % 10;
               for(int i = 0;i<=l;i++)
               {
                  if(digit>=max)
                  {
                     max= digit;
                  }
               }
   
            number = number/10;
         } 
      }
        
      for(max=max;max>0;max--)
      {
        
         for(int t = 0;t<length;t++)
         {
            String charValue = str.substring(t,t+1);
            int h = Integer.valueOf(charValue);
            int check = max - h; 
                 if(check>0)
                 {
                    System.out.print(" ");
                 }
                 else
                 {
                   System.out.print("*");
                 }    
         }
         
         System.out.println(); 
         in.close();
      }   
       
   }
}   
