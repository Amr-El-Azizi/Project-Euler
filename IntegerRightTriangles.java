public class IntegerRightTriangles
{
    int[][] triangles = new int[1][3];
    int[] perimeters = new int[1];
    int[] perimetercount = new int[1];
    int[] triangle = new int[3];
    public IntegerRightTriangles()
    {
        for(int a = 1; a + a + a <= 1000; a ++)
        {
            for(int b = a; a + b + b <= 1000; b++)
            {
                for(int c = b; a + b + c <= 1000; c ++)
                {
                    if((a * a) + (b * b) == (c * c))
                    {
                        triangle[0] = a;
                        triangle[1] = b;
                        triangle[2] = c;
                        add(triangle);
                    }
                }
            }
        }
        int perimeter = 0;
        boolean s = true;
        for(int i = 0; i < triangles.length; i ++)
        {
            s = true;
            perimeter = 0;
            for(int side: triangles[i])
            perimeter += side;
            for(int x = 0; x < perimeters.length && s; x ++)
                {
                    if(perimeters[x] == perimeter)
                    {
                        perimetercount[x] ++;
                        s = false;
                    }
                }
            if(s)
            add(perimeter);
            perimeter = 0;
            s = true;
        }
        int greatestcount = 0;
        int greatest = 0;
        for(int i = 0; i < perimeters.length; i ++)
            {
                if(perimetercount[i] > greatestcount)
                {
                    greatest = perimeters[i];
                    greatestcount = perimetercount[i];
                }
            }
        
        System.out.println(greatest);
        
        for(int i = 0; i < perimeters.length; i ++)
        if(perimeters[i] == 420)
        System.out.println(perimetercount[i]);
        //for(int[] tri: triangles)
        //{   
              // print(tri);
               //System.out.println("");
        //}
    }
    
    public void add(int[] arr)
    {
        int tln = triangles.length;
        int[][] temptriangles = new int[tln+1][3];
        for(int i = 0; i < tln; i ++)
            for(int x = 0; x < 3; x ++)
                temptriangles[i][x] = triangles[i][x];
        temptriangles[tln] = arr;
        triangles = temptriangles;
    }
    
    public void add(int p)
    {
        int pln = perimeters.length;
        int[] tempperimeters = new int[pln+1];
        int[] tempcounters = new int[pln+1];
        for(int i = 0; i < pln; i ++)
        {
            tempperimeters[i] = perimeters[i];
            tempcounters[i] = perimetercount[i];
        }
        tempperimeters[pln] = p;
        tempcounters[pln] = 1;
        perimeters = tempperimeters;
        perimetercount = tempcounters;
    }
    
        public void print(int[] arr)
    {
        for(int u : arr)
        System.out.print(u + "\t");
    }
}
