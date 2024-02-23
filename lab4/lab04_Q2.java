import java.util.Scanner;



public class lab04_Q2 
{

     public static void main(String[] args)
    {
        // input 
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the string:");
        String word = in.nextLine();
        int wordLenght = word.length();
        int finish = wordLenght-1;
        String reversedWord ="";
       
        while (finish>=0) // reversing the input
        {
          reversedWord = reversedWord + word.charAt(finish);
          finish--;
        }
        if (reversedWord.equals(word)) // checking
        {
            System.out.println("It is a polindrome.");
        }
        else
        {
           System.out.println("It is not a polindrome.");
        }
        
        in.close();
        

    } 
        
    
}
