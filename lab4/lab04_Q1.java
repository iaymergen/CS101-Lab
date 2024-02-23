import java.util.Scanner;

public class lab04_Q1 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Please input n:");
      int n = in.nextInt();
      int first =0;
      int second =1;
      int last ;
      int i  = 1;
      if(n==0) // for 0
      {
        System.out.printf("Fib(0) is 0");
      }
      if(n==1) // for 1

      {
        System.out.printf("Fib(1) is 0");
      }
      else
    {
      while(n>i)
            
      {

        last=first+second;
        first=second;
        second=last;
        i++;
        if(n==i)
        {
        System.out.println("Fib("+n+") is "+last);
        }
      }
    }

      in.close();
    }

}