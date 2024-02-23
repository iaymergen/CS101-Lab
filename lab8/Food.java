public class Food 
{
   private String name;
   private String ingredients;
   private int calories;
   private String type;
   private double price;

   Food(String name, double price)
   {
       this.name = name;
       this.price = price;
   }
   Food( String name, String ingredients, int calories, String type, double price)
   {
       this.name = name;
       this.ingredients = ingredients;
       this.calories = calories;
       this.type = type;
       this.price = price;
   }
   Food()
   {}

   // getter 
   public String getName()
   {
       return this.name;
   }
   public String getIngredients()
   {
    return this.ingredients;
   }
   public int getCalories()
   {
       return this.calories;
   }
   public String getType()
   {
       return this.type;
   }
   public double getPrice()
   {
       return this.price;
   }

   //setter
    public void setName(String name)
    {
       this.name = name;
    }
    public void setIngredients(String ingredients)
    {
        this.ingredients = ingredients;
    }
    public void setCalories(int calories)
    {
        this.calories = calories;
    }
    public void setType( String type)
    {
        this.type = type;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }


   public String addNewIngredients(String newIngredient)
   {
       this.ingredients = this.ingredients + ", " + newIngredient;
       return ingredients;
   }

   public boolean equals(Food food)
   {
       if((this.getName().equals(food.getName())) && (this.getIngredients().equals(food.getIngredients())))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
    public boolean doesContain(String ingredient)
    {
        if(this.getIngredients().contains(ingredient))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return this.getName() + " is a " + this.getType() + " dish.\n"  + "It includes " + this.getIngredients() + ".\n" + "Single portion contains " + this.getCalories() + "calories.\n" + "Single serving cost = " + String.format("%.1f",this.getPrice());
    }


}
