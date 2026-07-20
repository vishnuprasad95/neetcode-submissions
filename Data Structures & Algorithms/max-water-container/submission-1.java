class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = (heights.length-1);
        int maxArea=0;
        while(left<right)
        {
            int sum=(right-left)*min(heights[left],heights[right]);
            if(sum>maxArea)
            maxArea=sum;
            if(heights[left]<heights[right])
            left++;
            else right--;
        }
       return maxArea; 
    }
    public int min(int a,int b)
    {
        if(a<b)
        return a;
        else return b;
    }
}
