import java.util.Scanner;


public class lab04_Q4 
{
     public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        
        int n = in.nextInt();
        int r = 1;
        
        while (r<=n)
        {
            int c = 1;
            while(c<=r)
            {
                
                System.out.print("*");
                c++;
            }
            r++;
            System.out.println();
        }
        
        in.close();

    } 
        
    
} 