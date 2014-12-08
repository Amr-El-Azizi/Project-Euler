public class IntegerRightTriangles
{
    int[][] triangles;
    public IntegerRightTriangles()
    {
        int[] triangle = new int[3];
        boolean d = true;
        for(int a = 1; a < 1000; a ++)
        {
            for(int b = a; a + b < 1000 && d; b++)
            {
                for(int c = b; a + b + c < 1000 && d; c ++)
                {
                    if((a *a) + (b * b) = (c *c))
                    {
                        triangle[0] = a;
                        triangle[1] = b;
                        triangle[2] = c;
                        add(triangle);
                    }
                }
            }
            d = true;
        }
    }
    
    public void add(int[] arr)
    {
        int tln = triangles.length;
        int[][] temptriangles = new int[tln+1][3];
        for(int i = 0; i < tln; i ++)
        temptriangles[i] = triangles[i];
        temptriangles[tln] = arr;
        triangles = temptriangles;
    }
}
