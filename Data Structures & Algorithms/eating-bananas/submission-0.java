class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int answer =1;
        int low=1;
        int max= Integer.MIN_VALUE;
        for(int num : piles)
        {
            if(num>max)
             max=num;
        }
        int high = max;
        while(low<=high)
        {
            int mid=low + (high -low)/2;
            if(isValid(piles,h,mid))
            {
                answer = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return answer;
    }
    public boolean isValid(int [] piles,int h,int speed)
    {
        int total =0;
        for(int pile: piles)
        {
            total+=pile/speed;
            if(pile%speed!=0)
            total++;
        }
        return total <= h;
    }
}
