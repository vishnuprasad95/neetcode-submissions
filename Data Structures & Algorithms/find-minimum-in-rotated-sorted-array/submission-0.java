class Solution {
    public int findMin(int[] nums) {
        int high=nums.length-1;
        int low= 0;
        int ans=0;
        while(low<high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[high])
            {
                low=mid+1;
            }
            else
            {
                ans=nums[mid];
                high=mid;
                
            }
        }
        return nums[low];
    }
}
