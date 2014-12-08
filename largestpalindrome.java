public class largestpalindrome
{
    public largestpalindrome()
    {
        int[] lpalin = new int[0];
        int z = 0;
        int ip = 0;
        int np = 0;
        int[] d = new int[0];
        for(int i = 100; i < 1000; i ++)
        {
            for(int n = 100; n < 1000; n++)
            {
                z = i * n;
                d = inttoarr(z);
                if(palin(d) && greater(d, lpalin))
                {
                    lpalin = d;
                    ip = i;
                    np = n;
                }
            }
        }
        System.out.print(ip +"\t");
        System.out.print(np + "\t");
        print(lpalin);        
    }
    
    
    public int[] inttoarr(int x)
    {
        int ln = 0;
        int z = x;
        while(z > 0)
        {
            z = z/10;
            ln++;
        }
        int[] arr = new int[ln];
        for(int i = 0; i < ln; i ++)
        {
            arr[i] = x%10;
            x = x/10;
        }
        return arr;
    }
    
    public boolean palin(int[] arr1)
    {
        int[] temp = new int[arr1.length];
        for(int i = arr1.length-1; i >=0; i --)
        temp[arr1.length - i - 1] = arr1[i];
        
        for(int i = 0; i < arr1.length; i++)
        if(arr1[i] != temp[i])
        return false;
        
        return true;
    }
    
    public void print(int[] arr)
    {
        for(int u : arr)
        System.out.print(u);
    }
    
    public boolean greater(int[] arr1, int[] arr2)
    {
        int x = arrtoint(arr1);
        int y = arrtoint(arr2);
        return x > y;
    }
    
    public int arrtoint(int[] z)
    {
        int x = 0;
        int y = 0;
        int tens = 1;
        for(int i = z.length-1; i > -1; i --)
        {
            x += z[i] * tens;
            y++;
            tens = 1;
            for(int d = 0; d < y; d++)
            tens = tens*10;
        }
        return x;
    }
}
