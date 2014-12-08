public class largestprimefactorf
{
    public largestprimefactorf(long x)
    {
    boolean a = true;
    for(long i = 3; i < x; i ++)
    {
        if(x % i == 0 && i%2 == 1)
        { 
            for(long z = 2; z < i/2 && a; z++)
            if(i % z == 0)
            a = false;
            if(a)
            System.out.println(i);
        }
        a = true;
    }
    }
    
}
