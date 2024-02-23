import java.util.Scanner;

public class Lab02_Q2 
{
    public static void main(String[] args)    
    {
        // Read the odometer 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the odometer reading of the car in kilometers:");
        int carInput =input.nextInt();
        
        final int OIL_PERCENTAGE = 30;
        final int BATTERY_PERCENTAGE = 15;
        final int BRAKES_PERCENTAGE = 25;
        final int TIRE_PERCENTAGE = 13;
        final int OTHER_PERCENTAGE = 17;
        final String TOTAL= "TOTAL" ;
        String PERCENTAGE ="%";
        

        //calculations
        
        int oilChangeTotal = carInput *OIL_PERCENTAGE /100 ;
        int batteryTotal = carInput * BATTERY_PERCENTAGE /100;
        int brakesTotal = carInput *BRAKES_PERCENTAGE /100;
        int tireTotal = carInput*TIRE_PERCENTAGE/100;
        int otherTotal = carInput* OTHER_PERCENTAGE /100;
        int totalcost = carInput / 10;


        //outputs

        System.out.println("*************************************************");
        System.out.println("****** Maintenance Cost Distribution Table ******");
        System.out.printf("*Oil Change %7s%d %6d %n",PERCENTAGE ,OIL_PERCENTAGE,oilChangeTotal);
        System.out.printf("*Battery %10s%d%7d%n",PERCENTAGE, BATTERY_PERCENTAGE,batteryTotal);
        System.out.printf("*Brakes %11s%d%7d%n",PERCENTAGE, BRAKES_PERCENTAGE,brakesTotal);
        System.out.printf("*Tire %13s%d%7d%n",PERCENTAGE,TIRE_PERCENTAGE,tireTotal);
        System.out.printf("*Other %12s%d%7d%n",PERCENTAGE,OTHER_PERCENTAGE,otherTotal);
        System.out.printf("* %20s%7d%n",TOTAL,totalcost);
        System.out.println("*************************************************");
         
        input.close();

        
    }


    
}
