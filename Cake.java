//Singletone class - Eager way of creating Object
public class Cake
{
    private static Cake cake = new Cake();
    private Cake()        //Constructor
    {
        
    }
    //Eager way of creating Singleton Object
    public static Cake getCake()
    {
        return cake;
    }
}
class Testing
{
    public static void main(String args[])
    {
        Cake cake1 = Cake.getCake();
        System.out.println(cake1.hashCode());
        Cake cake2 = Cake.getCake();
        System.out.println(cake2.hashCode());
    }
}