import java.math.BigInteger;
public class Powerfuldigitsum
{
    BigInteger number = new BigInteger("0");
    BigInteger hundo = new BigInteger("100");
    BigInteger ten = new BigInteger("10");
    BigInteger number2 = new BigInteger("0");
    BigInteger zero = new BigInteger("0");
    BigInteger greatest = new BigInteger("1");
    BigInteger aval = new BigInteger("0");
    public Powerfuldigitsum()
    {
       for(int a = 1; a < 100; a ++)
       {
           aval = new BigInteger(Integer.toString(a));
           for(int b = 0; b < 99; b ++)
           {
               greatest = aval;
               for(int z = 0; z < b + 1; z ++)
               {
                   greatest = greatest.multiply(aval);
               }
               if(digitalsum(greatest).compareTo(digitalsum(number)) == 1)
               number = greatest;
           }
       }
       
       System.out.println(digitalsum(number));
    }
    
    public BigInteger digitalsum(BigInteger number)
    {
        BigInteger sum = zero;
        while(number.compareTo(zero) == 1)
        {
            sum = sum.add(number.mod(ten));
            number = number.divide(ten);
        }
        return sum;
    }
}
