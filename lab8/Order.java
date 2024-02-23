 public class Order 
{
    
    private static int count;
    private int ID;
    private double portion;
    private double totalPrice;
    private Food orderedFood = new Food();
    boolean check = false;
    boolean free = false;
    
    Order(double portion, String name, double price)
    {
        this.portion = portion;
        addOrder();
        this.ID = count *10 ;
        this.orderedFood = new Food(name, price);
    }

    Order (double portion,  Food orderedFood)
    {
        addOrder();
        this.ID = count;
        this.portion = portion;
        this.orderedFood = orderedFood;
    }

    // getter

    public int getID()
    {
        return this.ID;
    }
    public double getPortion()
    {
        return this.portion;
    }
   
    public double getTotalPrice()
    {
        return this.totalPrice;
    }

    public Food getOrderedFood()
    {
        return this.orderedFood;
    }
    public String getName()
    {
        return this.orderedFood.getName();
    }
   
    

    
    // setter
    public void setID( int ID)
    {
        this.ID = ID;
    }
    public void setPortion( double portion)
    {
        this.portion = portion;
    }
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    public void setOrderedFood( Food food)
    {
        this.orderedFood = food;
    }

    public static void addOrder()
    {
        count++;
    }
    public boolean equals(Order order)
    {
        if(this.getID() == order.getID())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double checkout()
    {
        check = true;
        this.totalPrice = this.getPortion() * this.orderedFood.getPrice();
        return this.totalPrice;

    }
    public void increasePortion(double extraPortion)
    {
        this.portion = this.portion + extraPortion;
    }

    public String toString()
    {
        
       if(this.getTotalPrice() == 0 && free == false)
       {
        return "Details for order " + this.getID() + " " + this.orderedFood.getName() + "( " + this.getPortion() + " portion)\n " + ">> Warning: This order is incomplete.";
       }
       else
       {
        return "Details for order " + this.getID() + " " + this.orderedFood.getName() + "( " + this.getPortion() + " portion) \n" + "TOTAL = "  +  String.format("%.1f",this.getTotalPrice());
       }
        
    }



}
