public class SpecialPythagTriplet2
{
    public SpecialPythagTriplet2(int z)
    {
        for(int a = 0; a < z/3; a ++)
            for(int b = a + 1; b < z; b++)
                {
                    int c = z - a - b;
                    if( a*a + b*b == c* c)
                    System.out.println(a*b*c);
                }
   }
}
