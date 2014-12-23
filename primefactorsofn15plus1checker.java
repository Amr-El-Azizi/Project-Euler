public class primefactorsofn15plus1checker
{
    long sum = 0;
    public primefactorsofn15plus1checker(long z, long y)
    {
        int counter = 0;
        boolean a = true;
        for(long i = 3; i <= num(z) && counter < 50000; i ++)
        {
            if(num(z) % i == 0 && i%2 == 1)
            { 
                for(long x = 2; x < i/2 && a; x++)
                if(i % x == 0)
                a = false;
                if(a && i < y)
                {
                    sum += i;
                    System.out.println(sum);
                }
            }
            counter ++;
            a = true;
        }
        System.out.println(sum);
    }
    
    public long num(long n)
    {
        long x = 1;
        for(int i = 0; i < 15; i ++)
        x = x * n;
        x ++;
        System.out.println(x);
        return x;
    }
}
