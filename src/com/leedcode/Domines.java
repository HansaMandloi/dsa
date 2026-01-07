package com.leedcode;

public class Domines {

	public static void main(String[] args) 
	{
		int [] tops =   {2,1,1,3,2,1,2,2,1};//{1,2,1,1,1,2,2,2}; //{1,1,1,1,1,1,3,3};
		int [] bottoms = {3,2,3,1,3,2,3,3,2};//{2,1,2,2,2,2,2,2};//{2,2,3,3,4,4,1,1};
		int swap = 0;
        int n = tops[0];
        for(int i = 1;i<tops.length;i++)
        {
            if(tops[i]==n)
            {
                continue;
            }
            else if(bottoms[i]!=n)
            {
//                System.out.println(-1);
//                return;
            	  int v = bottoms[0];
                  for(int j = 1;j<tops.length;j++)
                  {
                    if(bottoms[i]==v)
                    {
                        continue;
                    }
                    else if(tops[i]!=v)
                    {
                        System.out.println(-1);
                        return;
                    	
                    }
                    else 
                    {
                        swap++;
                    }
                    System.out.println(swap);
                    return;
            }
            }
            else 
            {
                swap++;
            }
        }
        System.out.println(swap);

	}

}
