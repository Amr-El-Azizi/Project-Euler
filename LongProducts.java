import java.math.BigInteger;

public class LongProducts
{
    public BigInteger counter = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger nine = new BigInteger("9");
    BigInteger ten = new BigInteger("10");
    BigInteger[] arr;
    boolean s = true;
    boolean b = true;
    BigInteger index2 = new BigInteger("0");
    public LongProducts(BigInteger m, BigInteger n)
    {
        arr = new BigInteger[n.intValue()];
        for(int i = 0; i < n.intValue(); i ++)
        arr[i] = one;
        outer: while(s)
        {
            for(int x = 0; x < arr.length && s == false; x ++)
            {
                if(arr[x] != nine)
                {
                    b = true;
                }
            }
            if(b == false)
            {
                s = false;
                continue outer;
            }
            b = false;
            if(arr[index2.intValue()] == 10)
            {
                arr[index2.intValue()] = one;
                arr[index2.intValue()-1].add(one);;
                index2 = 0;
            }
        }
    }
    
    public BigInteger product ()
    {
        BigInteger product = one;
        for(int i = 0; i < arr.length; i ++)
        {
            product.multiply(arr[i]);
        }
        return product;
    }
}