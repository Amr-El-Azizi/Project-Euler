public class sumofpfon
{
    long finalsum = 0;
    public sumofpfon()
    {
        for(long i = 0; i < 100000000000L; i++)
        {
            finalsum += new primefactorsofn15plus1checker(i, 100000000L).sum;
        }
        System.out.println(finalsum);
    }
}
