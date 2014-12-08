public class primenumberpatterns
{
    public primenumberpatterns(int x)
    {
        int index = 1;
        boolean a = true;
        for(int i = 2; index <= x; i ++)
        {
            if(i % 2 == 0 && i != 2)
            a = false;
            for(long z = 2; z < i/2 && a; z++)
            if(i % z == 0)
            a = false;
            if(a)
            {
                System.out.print(i + "\t");
                System.out.println(index);
                index ++;
            }
            a = true;
        }
    }
}
