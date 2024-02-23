
import java.util.Scanner;

public class lab03_Q3revision 
{
    public static void main(String[] args) 
    {
        //Take four digit PIN input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your PIN:");
        String PIN = in.next();
        int PINLenght = PIN.length();
        
        
       


        // operation 1 calculations

           double firstMoney = 1000;
           double cardLimitTwo= (firstMoney*2);

           // operation 4 addings
           String secret = "**";
           

        // opening 
        
        if (PIN.equals("1234"))
        {
          
            System.out.printf(" 1- Request a credit card%n 2- Withdraw money%n 3- Open a new account%n 4- Change PIN%nSelect an operation:");
            String operation = in.next();
            if (operation.equals("1")) // operation 1 cardLimit
            {
               System.out.print("Enter the card limit (cannot exceed 2 * your balance):") ;
               double cardLimit = in.nextDouble();
               if (cardLimit >= cardLimitTwo)
               {
                System.out.print("You entered an invalid amount! Bye!");
                 }
               
               else if (cardLimit<0)
               {
                 System.out.print("You entered an invalid amount! Bye!");
               }
               else
               {
                System.out.print("Your credit card request has been successfully received! Bye!");
               }
               

            }
            if (operation.equals("2")) // operation 2 withdraw
            {
                System.out.print("Enter the amount to withdraw:");
                 double withdrawMoney = in.nextDouble();
                 double lastMoney = firstMoney- withdrawMoney;
                 System.out.printf("Your new balance is %.2f TRY. Bye!",lastMoney);
            }
            if (operation.equals("3")) // operation 3 currency type
            {
                System.out.printf(" 1- TRY %n 2- USD %n 3- EUR%n 4- XAU%nSelect currency type:");
                String currencyType = in.next();
                if (currencyType.equals("1"))
                {
                   System.out.print("Your new TRY account is now opened! Bye!");
                }
                else if (currencyType.equals("2"))
                {
                   System.out.print("Your new USD account is now opened! Bye!");
                }
                else if (currencyType.equals("3"))
                {
                    System.out.print("Your new EUR account is now opened! Bye!");   
                }
                else if (currencyType.equals("4"))
                {
                    System.out.print("Your new XAU account is now opened! Bye!");   
                }
                else 
                {
                    System.out.print("Your selection is invalid! Bye!");
                }


            }
            if (operation.equals("4")) // operation 4 new PIN
            
            
            System.out.print("Enter your new PIN: ");
            String newPIN = in.next();
            int newPINLenght = newPIN.length();
            
            char char1 = newPIN.charAt(0);
            char char2 = newPIN.charAt(1);
            char char3 = newPIN.charAt(2);
            char char4 = newPIN.charAt(3);
            
            if (newPINLenght == 4 )
            {
                if (Character.isDigit(char1) && Character.isDigit(char2)&&Character.isDigit(char3)&&Character.isDigit(char4))
                
                
    
                {
                    char firstDigit = newPIN.charAt(0);
                char lastDigit = newPIN.charAt(3);
                String newPINSecret = firstDigit+secret+lastDigit;
                System.out.printf("Your PIN is changed to %s. Bye!",newPINSecret);
                   
                }
                else
                {
                    System.out.print("Invalid PIN! Bye!");
                }
            }
            else 
            {
                System.out.print("Invalid PIN! Bye!");
            }
            
            

        }
        else // wrong PIN
        {
           System.out.println("Invalid PIN! Bye!");
        }
        
in.close();

        
    } 
        
    
    
}
