public class Summationofprimes
{
    public Summationofprimes()
    {
        boolean a = true;
        long sum = 2;
        for(long i = 3; i <= 2000000L; i ++)
        {
            for(long z = 2; z < i/2 && a; z++)
            {
                if(i % z == 0)
                {  
                    a = false;
                }
            }
            if(a == true)
            {
                sum += i;
            }
            a = true;
        }
        System.out.println(sum);
    }
}
