import java.math.BigInteger;
public class PrimeFactorsofn15plus1
{
    long sum = 0;
    public PrimeFactorsofn15plus1()
    {
    boolean a = true;
    long counter = 0;
    for(long z = 3; z < 100000000000L; z ++)
    {
        for(long i = 3; i <= num(z) && counter < 50000; i ++)
        {
            if(num(z) % i == 0 && i%2 == 1)
            { 
                for(long x = 2; x < i/2 && a; x++)
                if(i % x == 0)
                a = false;
                if(a && i < 100000000L)
                {
                    sum += i;
                    System.out.println(sum);
                }
            }
            counter ++;
            a = true;
        }
        counter = 0;
    }
    }
    
    public long num(long n)
    {
        long x = 1;
        for(int i = 0; i < 15; i ++)
        x = x * n;
        x ++;
        return x;
    }
}
