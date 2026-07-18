class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1;
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int poduct=1;
            for(int j=0;j<nums.length;j++)
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
