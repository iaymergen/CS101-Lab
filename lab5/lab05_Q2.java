import java.util.Scanner;
import java.util.Random; 


public class lab05_Q2

{
    public static void main(String[] args) 
    {
      String remove = "";
      String deck = "";
      String removed= "";
      int sumPlayer = 0;
      int sumDealer = 0;
      String deckPlayer = "";
      String deckDealer= "";
      int playerAdd = 0;
      String playerString = "";
      int dealerAdd =0;
      String dealerString = "";
      Scanner in = new Scanner(System.in);
      Random rand = new Random(); 
      int randomChoice;
      int choice;

        // creating deck
        System.out.println("Starting the game with the following deck:");
           for(int i = 1; i<=9 ; i++) 
            {  
              for(int d=0; d<4; d++)
              {
                deck = deck+i;
              }
            }
          System.out.println(deck);
          int deckLenght = deck.length()-1;
          System.out.println("Dealer is now dealing cards...");

            for(int t=0; t<2; t++)
            {
              if(t==0) // players cards
              {
                System.out.println("Player's hand:");
                  for(int p =0 ;p<2; p++)
                  {   
                    randomChoice = rand.nextInt(deckLenght); 
                    char randomCard = deck.charAt(randomChoice);
                    System.out.print(randomCard);
                         
                    playerAdd = Character.getNumericValue(randomCard);
                    playerString = Character.toString(randomCard);
                        
                    sumPlayer=sumPlayer+playerAdd;
                    deckPlayer=deckPlayer+playerString;
                        
                    remove = Character.toString(randomCard);
                    deck  = deck.replaceFirst(remove, removed);

                  }
                  System.out.println();
                
              if(t==1) // dealers cards
              {
                System.out.println("Dealer's hand:");
                  for(int d=0 ;d<2; d++)
                  {
                    randomChoice = rand.nextInt(deckLenght);
                    char randomCard = deck.charAt(randomChoice);    

                    dealerAdd = Character.getNumericValue(randomCard);
                    dealerString = Character.toString(randomCard);

                    sumDealer=sumDealer+dealerAdd;
                    deckDealer=deckDealer+dealerString;

                    remove = Character.toString(randomCard);
                    deck  = deck.replaceFirst(remove, removed);

                      if(d==0) //dealers output
                      { 
                        System.out.print(randomCard);
                      }
                      if(d==1)
                      {
                        System.out.println("?");
                      }
                    }
                }  
              }
            }
      System.out.println();
      System.out.printf("Please enter your choice:%n1) Hit%n2)Stand%n"); //hit or stand choice for player
      
    do
    {
        choice = in.nextInt();
        
        if(choice==1)  //hit
      {
        System.out.println("Hit! Dealer is giving the player a card...");
        randomChoice = rand.nextInt(deckLenght); 
        char randomCard = deck.charAt(randomChoice);
                         
        playerAdd = Character.getNumericValue(randomCard);
        playerString = Character.toString(randomCard);
                        
        sumPlayer=sumPlayer+playerAdd;
        deckPlayer=deckPlayer+playerString;

        remove = Character.toString(randomCard);
        deck  = deck.replaceFirst(remove, removed);
          
        System.out.printf("Player's hand:%n%s%n%n",deckPlayer);

            if(sumPlayer==21)
            {
             System.out.printf("Dealer's hand:%n%s%n",deckDealer);
             System.out.println("Player scored 21. Player wins!");
            }
            if(sumPlayer>21)
            {
             System.out.printf("Dealer's hand:%n%s%n",deckDealer);
             System.out.println("Player scored over 21. Player lost!");
            }
            if(sumPlayer<21)
            {
             System.out.printf("Player scored %d%n",sumPlayer);
            }
        }
           if(choice==2) //stand
          {
           System.out.printf("Stand! Player's turn is now over. Player's hand sums to %d%n%n",sumPlayer);
           System.out.println("Dealer is drawing cards...");
          }
      }
      while(sumPlayer<21&&choice==1);
      
    if(sumPlayer<21)
    {
       do
       {
        randomChoice = rand.nextInt(deckLenght);
        char randomCard = deck.charAt(randomChoice);    

        dealerAdd = Character.getNumericValue(randomCard);
        dealerString = Character.toString(randomCard);

        sumDealer=sumDealer+dealerAdd;
        deckDealer=deckDealer+dealerString;

        remove = Character.toString(randomCard);
        deck  = deck.replaceFirst(remove, removed);
            
        System.out.printf("Dealer's hand:%n%s%n",deckDealer);
            
          if(sumDealer>21)
          {
            System.out.println("Dealer scored over 21. Dealer lost!");
          }
          else if(sumDealer==21)
          {
            System.out.println("Dealer scored 21. Dealer wins!");
          }  
          else if(sumDealer>sumPlayer)
          {
            System.out.println("Dealer scored more than player. Dealer wins!");
          }
        }
        while(sumDealer<sumPlayer);
    }     
      
    System.out.printf("Ending the game with the following deck:%n%s%n",deck);
    in.close();
   }
}