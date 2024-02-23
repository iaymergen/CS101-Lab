import java.util.Scanner;

public class Lab02_Q3 
{
    public static void main(String[] args)
     {
         // Read the input
          Scanner in = new Scanner(System.in);
          System.out.print("Enter the title:");
          String title1 = in.next();
          String title2 = in.next();
          String title3 = in.next();
          String title  ="   "+title1 +" "+ title2 +" "+ title3+"    ";
          String titleBlanksRemoved = title1+" "+ title2 + " "+ title3;
          

          // calculations
          int numberOfCharacters = title.length();
          String allUppercase = title.toUpperCase();
          char indexPositionfive = title.charAt(5);
          String sub = title.substring(3, 7);
          char findA = 'a'; 
          char findAA = 'A';
          int firstAOccurence = title.indexOf(findA);
          int lastOccurence = title.lastIndexOf(findA);
          String title33 = title3.replace(findA, findAA);
          String allMixed = title2 + " " + title1 +" "+ title33;


          // compute
           System.out.println("--------------------------------------");
           System.out.printf("Number of characters: %d%n",numberOfCharacters);
           System.out.printf("All uppercase:%s%n",allUppercase);
           System.out.printf("Remove leading and trailing blank characters:%s%n",titleBlanksRemoved);
           System.out.printf("Character at index position 5:%s%n",indexPositionfive);
           System.out.printf("Title from 3rd character to 8th character (not included):%s%n",sub);
           System.out.printf("First occurence of character 'a':%d%n",firstAOccurence);
           System.out.printf("Last occurence of character 'a':%d%n",lastOccurence);
           System.out.printf("All mixed up title:%s%n",allMixed);
           


           in.close();

        
    }
}
