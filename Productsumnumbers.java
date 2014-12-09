public class Productsumnumbers
{
    int[] Ns = new int[1];
    int[] Ks = new int[1];
    boolean d = true;
    int counter2 = 0;
    public Productsumnumbers()
    {
        int counter = 0;
        outer: for(int i = 2; i <= 12; i ++)
        {
            d = true;
            int[] A = new int[i];
            for(int x = 0; x < i; x++)
            A[x] = 1;
            
            if(sum(A) == product(A))
            {
                addN(sum(A));
                addK(i);
                counter = 0;
                continue outer;
            }
            
            while (d && counter < 100)
            {
                for(int x = 0; x < i && d; x++)
                {
                    if(d && sum(A) != product(A))
                    A[x]++;
                    if(sum(A) == product(A))
                    {
                        d = false;
                        addN(sum(A));
                        addK(i);
                    }
                    counter ++;
                }
            }
            
            for(int x = 0; x < i; x++)
            A[x] = 1;
            for(int x = 0; x < i && d; x++)
                {
                    if(d && sum(A) != product(A))
                    A[x] = A[x] + counter2;
                        
                    if(sum(A) == product(A))
                    {
                        if(Ns.length > i)
                        {
                            if(sum(A) < Ns[i])
                            {
                                addN(sum(A));
                                addK(i);
                            }
                        }
                        else
                        {
                            addN(sum(A));
                            addK(i);
                        }
                    }
                    counter2 ++;
                }
            counter2 = 0;
            for(int x = 0; x < i; x++)
            A[x] = 1;
            for(int x = 0; x < i; x++)
            {
                for(int z = 0; z < i - 1; z++)
                {
                     if(d && sum(A) != product(A))
                     A[x] ++;
                     if(sum(A) == product(A))
                    {
                        if(Ns.length > i)
                        {
                            if(sum(A) < Ns[i])
                            {
                                addN(sum(A));
                                addK(i);
                            }
                        }
                        else
                        {
                            addN(sum(A));
                            addK(i);
                        }
                    }
                }
            }
            counter = 0;
        }
        d = true;
        System.out.println(sumN(Ns));
    }
    
    public void addN(int x)
    {
        int nln = Ns.length;
        int[] temp = new int[nln+1];
        for(int i = 0; i < nln; i++)
        temp[i] = Ns[i];
        temp[nln] = x;
        Ns = temp;
    }
    
    public void addK(int x)
    {
        int aln = Ks.length;
        int[] temp = new int[aln+1];
        for(int i = 0; i < aln; i++)
        temp[i] = Ks[i];
        temp[aln] = x;
        Ks = temp;
    }
    
    public int sum(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
        sum += i;
        return sum;
    }
    
    public int sumN(int[] arr)
    {
        int[] newarr = new int[arr.length];
        boolean s = true;
        for(int i = 0; i < arr.length; i ++)
        {
            s = true;
            for(int x = 0; x < arr.length; x ++)
            {
                if(arr[i] == newarr[x])
                {
                    s = false;
                }
            }
            if(s)
            {
                newarr[i] = arr[i];
            }
            s = true;
        }
        return sum(newarr);
    }
    
    public int product(int[] arr)
    {
        int product = 1;
        for(int i : arr)
        product = product * i;
        return product;
    }
    
        public void print(int[] arr)
    {
        for(int u : arr)
        System.out.print(u + "\t");
    }
}
