public class ConsecutivePrimeSum
{
    int[] primes = {2};
    boolean a = true;
    public ConsecutivePrimeSum(int x)
    {
        for(int i = 3; i < x; i ++)
        {
            a = true;
            if(i % 2 == 0)
            a = false;
            for(int z = 2; z < i/2 + 1 && a; z ++)
            {
                if(i % z == 0)
                a = false;
            }
            if(a)
            {
                add(i);
            }
            a = true;
        }

        print(primes);
        int numofp = 0;
        int tempnumofp = 0;
        for(int i = primes.length - 1; i >= 0; i ++)
        {
            
        }
    }
    
    public void add(int x)
    {
        int pln = primes.length;
        int[] temp = new int[pln+1];
        for(int i = 0; i < pln; i ++)
        temp[i] = primes[i];
        temp[pln] = x;
        primes = temp;
    }
    
    public void print(int[] arr)
    {
        for(int u : arr)
        System.out.print(u + "\t");
    }
}
