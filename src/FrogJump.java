
public class FrogJump 
{
    static int best(int nums[],int n,int idx)
    {
    	if(idx==n-1) return 0;
    	int op1 = best(nums,n,idx+1) + Math.abs(nums[idx+1]-nums[idx]);
    	if(idx==n-2) return op1;
    	int op2 = best(nums,n,idx+2) + Math.abs(nums[idx+2]-nums[idx]);
    	
    	return Math.min(op1, op2);
    	
    }
	public static void main(String[] args)
	{
		int ans []= {10,30,40,20};
        System.out.println(best(ans,ans.length, 0));
	}

}
