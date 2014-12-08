public class fibonnacipatterns
{
    public fibonnacipatterns()
    {
	long sum = 0;
	int x = 1;
	int y = 0;
	int index = 0;
	for(int i =1; i < 4000000;)
	{
	   if(i%2 == 0)
	   sum += i;
	   y = i;
	   System.out.print(sum + "\t");
	   System.out.print(i + "\t");
	   System.out.println(index);
	   i += x;
	   x = y;
	   index ++;
	}
	System.out.println(sum);
    }
}

