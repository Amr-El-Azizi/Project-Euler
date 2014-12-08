import java.math.BigInteger;
public class PowerDigitSum
{
    BigInteger power = new BigInteger("2");
    BigInteger sum = new BigInteger("0");
    public PowerDigitSum()
    {
       for(int i = 1; i < 1000; i ++)
       power = power.multiply(new BigInteger("2"));
       System.out.println(power);
       while(power.compareTo(new BigInteger("0")) == 1)
       {
           sum = sum.add(power.mod(new BigInteger("10")));
           power = power.divide(new BigInteger("10"));
           System.out.println(sum);
       }
       System.out.println(sum);
    }
}
