public class largestprimefactor
{
    public largestprimefactor(long x)
    {
    boolean a = true;
    boolean b = true;
    for(long i = x; i>0 && b; i --)
    {
        if(x % i == 0 && i%2 == 1)
        { 
            for(long z = 2; z < i/2 && a; z++)
            if(i % z == 0)
            a = false;
            if(a)
            {
                System.out.println(i);
                b = false;
            }
        }
        a = true;
    }
    }
}
