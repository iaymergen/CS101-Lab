import java.util.Scanner; 

public class lab05revision
{
   public static void main(String[] args) 
   {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter city plan string:");
    String str = in.nextLine();
    int length = str.length();
    int l = length-1;
    int digit;
    int max = Integer.MIN_VALUE;

    System.out.println("City blueprint:");

         //String for finding max
        String maxString = str.replaceAll("P", "0");
        int maxStringLenght = maxString.length();
        int maxl = maxStringLenght-1;
        int number = Integer.valueOf(maxString);

      for(int j=0; j<=maxl; j++)
      {
         while(number>0)
         {
            digit = number % 10;
               for(int i = 0; i<=l; i++)
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
        if(max>1)
        {
           
              for(int t = 0; t<length; t++)
            {
                 String charValue = maxString.substring(t,t+1);
                 int h = Integer.valueOf(charValue);
                 int check = max - h; 
                
                 String p ="P";
                 char checkpp = str.charAt(t);
                 String checkp = Character.toString(checkpp);
               
                 if(checkp.equals(p))
                    {
                
                      char shiftCheck = str.charAt(t+1);
                      int shift = Character.getNumericValue(shiftCheck);
                         for(int s=0;s<shift-1;s++)
                        {
                         System.out.print(" ");
                        }
                     t++;
                    }
               
                 if(check>0)
                    {
                      System.out.print(" ");
                    }
                 
                 else
                    {
                     System.out.print("*");
                    }    
            }
        }
        
        if(max==1)
        {
            for(int a = 0; a<l; a++)
            {
             String P = "P";
             char checkPP = str.charAt(a);
             String checkP = Character.toString(checkPP);
                 if(checkP.equals(P))
                { 
                  Character pLenght = str.charAt(a+1);
                  int pLenghtInt = Character.getNumericValue(pLenght);
                     for(int p =0;p<pLenghtInt;p++)
                    {
                     System.out.print("*");
                    }
                 a++;
                }
                 else
                {
                     if(checkP.equals("0"))
                    {
                      System.out.print(" ");
                    }
                     else 
                    {
                     System.out.print("*");
                    }
                }
        }
        System.out.print("*");
        }
        System.out.println(); 
        in.close();
    }   
   }
}   

