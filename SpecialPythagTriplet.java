public class SpecialPythagTriplet
{
    int a;
    int b;
    double c;
    public SpecialPythagTriplet(int z)
    {
        boolean d = true;
        boolean e = true;
        double y = 0;
        for(int i = 1; d && i <= z/3; i ++)
        {
            a = i;
            c = 0;
            for(int x = i; e && x < z; x ++)
            {
                b = x;
                y = Math.sqrt((a*a) + (b * b));
                if((y == Math.floor(y)) && !Double.isInfinite(y))
                {
                    c = y;
                    e = false;
                }
                else if(e)
                b = 0;
            }
            if(a + b + c == z)
            d = false;
            System.out.print(a + "\t");
            System.out.print(b + "\t");
            System.out.println(c);
            e = true;
        }
        System.out.println(a * b * c);
    }
}
