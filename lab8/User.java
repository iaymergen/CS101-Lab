import java.util.Random;

public class User 
{
    private static int count;
    private String name;
    private int ID;
    private int age;
    private String orders = "";
    private int numberOfOrders;
    private String eatenFoods;
    private Food favouriteFood;
    int start;
    int end;

    Random rand = new Random();


    // consturctor
    User(String name, int age)
    {
        addUser();
        this.name = name;
        this.age = age;
        this.ID = count;
    }

    //getter
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getID()
    {
        return this.ID;
    }
    public String getOrders()
    {
        return this.orders;
    }
    public int getNumberOfOrders()
    {
        return this.numberOfOrders;
    }
    public String getEatenFoods()
    {
        return this.eatenFoods;
    }
    public Food getFavouriteFood()
    {
        return this.favouriteFood;
    }

    // setter
    public void setName(String name)
    {
        this.name = name;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setOrders(String orders)
    {
        this.orders = orders;
    }
    public void setEatenFoods(String eatenFoods)
    {
        this.eatenFoods = eatenFoods;
    }
    public void setNumberOfOrders(int numberOfOrders)
    {
        this.numberOfOrders = numberOfOrders;
    }
    public void setFavoriteFood(Food favouriteFood)
    {
        this.favouriteFood = favouriteFood;
    }


    //methods

    public static void addUser()
    {
        count++;
    }

    public boolean equals(User user)
    {
        if(this.name.equals(user.getName()) && this.age == user.getAge() && this.ID == user.getID())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean didEatFood(Food food)
    {
        
        if(this.getEatenFoods().contains(food.getName()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void addNewOrder(Order order)
    {
        System.out.println("Adding a new order of " + order.getName() + " to" + this.getName());
        numberOfOrders++;
        this.eatenFoods = this.eatenFoods + "-" + order.getName();
        if(this.orders.length() == 0)
        {
            this.orders = " " + order.getID();
        }
        else
        {
            this.orders = this.orders + "-" + order.getID();
        
        }
        
       
        if(this.favouriteFood.equals(order.getOrderedFood()))
        {
            System.out.println(order.getName() + " is " + this.getName() + "'s favorite food!");
            order.free = true;
            int randomChoice = rand.nextInt(8) + 1;
            if(randomChoice < 5)
            
            {
                System.out.println(this.getName() + " won't be paying today.");
                System.out.println("Applying favorite food discount...");
                favouriteFood.setPrice(0);
                order.checkout();
                
            }
            else
            {
                System.out.println(order.getName() + " is " + this.getName() + "'s favorite food!");
                System.out.println(this.getName() + " lost the chance.");
                
            }
        }
        else{}

        
    }
    public int indexFind (String str, int n)
    {
        int i = 0;
        int count = 0;
        while(count < n)
        {
            if(str.charAt(i) == '-')
            {
                count++;
            }
            i++;
        }return i;
    } 
    public String pickOrderbyIndex (int index)
    {
        int dashCount = 0;
        int dashStart = 0;
        int dashEnd = 0;
        for(int d= 0; d<orders.length(); d++)
        {
            if(orders.substring(d, d+1).equals("-"))
            {
                dashCount++;
            }
        }
        
       if(index == 1)
       {
           int a = orders.indexOf("-");
           return orders.substring(0, a);
       }
       if(index - 1 != dashCount)
       {
           dashStart = indexFind(orders, index-1);
           dashEnd = indexFind(orders, index) -1;
           return orders.substring(dashStart, dashEnd);
        }    
        
       
       if(index - 1 == dashCount)
       {
           int t = orders.lastIndexOf("-");
           return orders.substring(t+1);
       }
       else
       {
           return " ";
       }
       
       
       
    }


    public String toString()
    {
        return "User ID:" + this.getID() + ", User Name: " + this.getName() + ", Age: " + this.getAge();
    }

    



    
}
