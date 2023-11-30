class Game
{
    public static void main(String args[])
    {
        //game design
        boolean run=true;
        boolean jump=true;
        boolean weapon=false;
        boolean fly=false;
        
        //God Mode - All 4 powers
        //Legend Mode - Run and Weapon
        //else Regular Mode
        
        //Bad implementation
        if(jump==true)
        {
            if(run==true)
            {
                if(weapon==true)
                {
                    if(fly==true)
                    {
                        System.out.println("God Mode Activated");
                    }
                }
            }
        }
        else if(run==true)
        {
            if(weapon==true)
            {
                System.out.println("Legend Mode Activated");
            }
        }
        else
        {
            System.out.println("Regular Mode Activated");
        }
        
        
        //good implementation
        if(run && jump && weapon && fly)
        {
            System.out.println("God Mode Activated");
        }
        else if(run && weapon)
        {
            System.out.println("Legend Mode Activated");
        }
        else
        {
            System.out.println("Regular Mode Activated");
        }
    }
}