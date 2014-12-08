public class SumSquareDifference
{
    public SumSquareDifference()
    {
        int sumsquares = 0;
        int squaresums = 0;
        int tempsum = 0;
        for(int i = 0; i <= 100; i ++)
        sumsquares += i * i;
        for(int i = 0; i <= 100; i ++)
        tempsum += i;
        squaresums = tempsum * tempsum;
        System.out.println(sumsquares);
        System.out.println(tempsum);
        System.out.println(squaresums);
        System.out.println(squaresums - sumsquares);
    }
}
