public class multiples35
{
 public  multiples35()
 {
   int sum  = 0;
   for(int i = 0; i < 1000; i++)
   {
       if(i%3 == 0 || i%5 == 0)
       sum = sum + i;
   }
   System.out.println(sum);
 }
}
