import java.util.Scanner;

public class lab04_Q4revision 
{
    public static void main(String[] args) 
    
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n = in.nextInt();
        int r = 1;
        int nNew = n*2;
        int a = n-1;
        

        while(r<=nNew)
        {
            int j = a ;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }
                int c = 1;
                while(c<=r)
                {
                   c++;
                   System.out.print("*");   
                }
            r=r+2;
            a--;
            System.out.println(); 
        }

      in.close();
    }
}
