import java.util.Scanner;

public class lab03_Q3 
{
    public static void main(String[] args) 
    {
        //Take four digit PIN input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your PIN:");
        String PIN = in.next();
           // operation 1 calculations

           double firstMoney = 1000.0;
           // operation 3 
           String secret = "**";
           

        // opening 
        
        if (PIN.equals("1234"))
        {
          
            System.out.printf(" 1- Withdraw money%n 2- Open a new account%n 3- Change PIN%nSelect an operation:");
            String operation = in.next();
            if (operation.equals("1"))
            {
                System.out.print("Enter the amount to withdraw:");
                 double withdrawMoney = in.nextDouble();
                 double lastMoney = firstMoney- withdrawMoney;
                 System.out.printf("Your new balance is %.2f TRY. Bye!",lastMoney);
            }
            if (operation.equals("2"))
            {
                System.out.printf(" 1- TRY %n 2- USD %nSelect currency type:");
                String currencyType = in.next();
                if (currencyType.equals("1"))
                {
                   System.out.print("Your new TRY account is now opened! Bye!");
                }
                else
                {
                   System.out.print("Your new USD account is now opened! Bye!");
                }

            }
            if (operation.equals("3"))
            System.out.print("Enter your new PIN: ");
            String newPIN = in.next();
            char firstDigit = newPIN.charAt(0);
            char lastDigit = newPIN.charAt(3);
            String newPINSecret = firstDigit+secret+lastDigit;
            System.out.printf("Your PIN is changed to %s. Bye!",newPINSecret);

        }
        else 
        {
           System.out.println("Invalid PIN! Bye!");
        }
        
in.close();

        
    } 
        
    
    
}
