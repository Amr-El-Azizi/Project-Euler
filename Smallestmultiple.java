public class Smallestmultiple
{
    public Smallestmultiple()
    {
        boolean x = true;
        boolean y = true;
        for(int i = 1; x; i ++)
        {
            for(int z = 1; z < 20 && y; z ++)
                if(i%z != 0)
                y = false;
            if(y)
            {
                System.out.println(i);
                x = false;
            }
            y = true;
        }
    }
}
