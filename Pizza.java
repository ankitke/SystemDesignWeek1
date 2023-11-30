//Singleton Class - Lazy way of creating Object- Synchronized for thread Safety 
public class Pizza
{
    private static Pizza pizza;
    //creating object with constructor
    
    private Pizza()
    {
        
    }
    //lazy way of creating singleton object
    public static Pizza getPizza()
    {
        synchronized(Pizza.class)
        {
            if(pizza==null)
            {
                pizza = new Pizza();
            }
        }
        return pizza;
    }
}
class Testing
{
	public static void main(String args[])
	{
		Pizza pizza1 = Pizza.getPizza();
		System.out.println(pizza1.hashCode());
		Pizza pizza2 = Pizza.getPizza();
		System.out.println(pizza2.hashCode());
	}
}
	