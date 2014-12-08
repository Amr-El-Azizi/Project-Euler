public class LongestCollatzSequence
{
    int length = 0;
    int longestln = 0;
    int longestval = 0;
    boolean a = true;
    int n = 0;
    public LongestCollatzSequence()
    {
        for(int i = 2; i < 1000000 ; i ++)
        {
            n = i;
            while(a)
            {
                if(n == 1)
                {
                    a = false;
                    break;
                }
                if(n % 2 == 0)
                n = n/2;
                else if(n % 2 == 1)
                n = (n * 3) + 1;
                length ++;
            }
            if( length > longestln)
            longestval = i;
            length = 0;
            a = true;
        }
        System.out.println(longestval);
    }
}
