import java.util.Scanner;

public class lab06 
{
    public static int sumOfDigits(int input)
    {
        int sum = 0;
        int lenght = digitCount(input);
       for(int a = 0; a<= lenght; a++)
       {
           int digit = input % 10;
           sum = sum+ digit;
           input = input/10;
       }
       return sum;
    }
    public static int digitCount (int input)
    {
        int lenght = 0;
        do 
        {
           lenght++;
           input = input/10;
        }
        while(input>0);
        return lenght;
    }
    public static boolean isHarshad(int input)
    {
      int harshCheck = input % sumOfDigits(input);
        if(harshCheck==0)
        {
         return  true;
        }
        else
        {
         return false;
        }
    }
    public static boolean isPrime (int input)
    {
        int p = 0;
        
        for (int b = 1; b<=input;b++)
        {
            if(input%b==0)
            {
                p++;
            }
        }

        if(p==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isPerfectSquare (int input)
    {
           int ps = (int)Math.sqrt(input);
           if(ps*ps== input )
           {
               return true;
           }
           else
           {
               return false;
           }
    }
    public static boolean isFibonacci(int input)
    {
        int checkOne = 5*input*input+4;
        int checkTwo = 5*input*input-4;
        if(isPerfectSquare(checkOne)||isPerfectSquare(checkTwo))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int power (int digitInt ,int Count)
    {
      
      int p = 1;
      for(int a = 0 ; a<Count ; a++)
      {
        p = p*digitInt;
      }
      return p;
    }
    public static boolean isNarcissistic (int input)
    {
        int checkSum = 0;
        int digitInt;
        int c = digitCount(input);
        int inputFirst = input;
        do
        {
            digitInt = input % 10;
            digitInt = power(digitInt,c);
            checkSum = checkSum + digitInt;
            input = input/10;
        }
        while(input>0);
        if(checkSum==inputFirst)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        
      Scanner in = new Scanner(System.in);
      System.out.print("Enter number to be examined:");
      int input = in.nextInt();

      System.out.printf("Number of digits:%d%n",digitCount(input));
      System.out.printf("Sum of digits:%d%n",sumOfDigits(input));
      if(isFibonacci(input))
      {
          System.out.printf("%d  is a Fibonacci number.%n",input);
      }
      else
      {
            System.out.printf("%d  is not a Fibonacci number.%n",input);
      }
      if(isHarshad(input))
      {
        System.out.printf("%d  is a Harshad number.%n",input);
      }
      else
      {
        System.out.printf("%d  is not a Harshad number.%n",input);
      }

      if(isNarcissistic(input))
      {
        System.out.printf("%d  is a Narcissistic.%n",input);
      }
      else
      {
            System.out.printf("%d  is not Narcissistic.%n",input);
      }
      if(isPrime(input))
      {
        System.out.printf("%d  is a Prime number.%n",input);
      }
      else
      {
        System.out.printf("%d  is not a Prime number.%n",input);
      }
      in.close();
    } 
}
