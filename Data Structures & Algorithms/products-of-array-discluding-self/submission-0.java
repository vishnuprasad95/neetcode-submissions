class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        int[] output = new int[nums.length];
        for(int i=0;i<output.length;i++)
        {
            output[i]=nums[i];
        }
        for(int i=0;i<output.length;i++)
        {
            int poduct=1;
            for(int j=0;j<output.length;j++)
            {
            if(j!=i)
            {
            poduct*=nums[j];
            }
            }
            output[i]=poduct;
        }
        return output;
    }
}  
