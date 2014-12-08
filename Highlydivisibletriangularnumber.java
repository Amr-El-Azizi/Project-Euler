public class Highlydivisibletriangularnumber
{
    public Highlydivisibletriangularnumber()
    {
        int number = 1;
        int counter = 2;
        int factors = 0;
        boolean a = true;
        while(a)
        {
            number += counter;
            counter ++;
            for(int i = 1; i <= number; i ++)
                if(number % i == 0)
                factors ++;
            if(factors > 500)
            {
                System.out.println(number);
                a = false;
            }
            factors = 0;
        }
    }
}
