public class Lab01_Q3
{
     
    public static void main(String[] args)
    
    
    {
        final long EARTH_AREA = 510072000 ; // Total area of Earth
        double waterPercentageOnEart = 0.708 ; 
        double dryLandPercentageOnEarth = 0.292 ; 
        double dryLandOnEarth = dryLandPercentageOnEarth * EARTH_AREA ; 
        double waterOnEarth = EARTH_AREA * waterPercentageOnEart ;
 
        long TURKEY_AREA = 783469 ; 
        double dryLandPercentageOnTurkey = (0.987);
        double dryLandOnTurkey = TURKEY_AREA * dryLandPercentageOnTurkey ;
        

        double waterPercentageOnTurkey = 0.13 ;
        double waterOnTurkey = TURKEY_AREA * waterPercentageOnTurkey ;
        

                          
        
        double dryTurkeyOnEarth = dryLandOnTurkey / dryLandOnEarth * 100 ; 

        double waterTurkeyOnEart = waterOnTurkey / waterOnEarth * 100 ;
         
        System.out.print("Earth has ");
        System.out.print(dryLandOnEarth);
        System.out.print(" km2 dry land and ");
        System.out.print( waterOnEarth ) ;
        System.out.println (" km2 water. ");

        System.out.print("Turkey has ");
        System.out.print(Math.round(dryLandOnTurkey));
        System.out.print(" km2 dry land and ");
        System.out.print(Math.round(waterOnTurkey));
        System.out.println(" km2 water.");

        System.out.print("Turkey has ");
        System.out.print(dryTurkeyOnEarth);
        System.out.println(" percent of the Earth's dry land.");


        
        System.out.print("Turkey has ");
        System.out.print(waterTurkeyOnEart);
        System.out.println(" percent of the Earth's water.");



        
    
    
    
        
    }
    
}
