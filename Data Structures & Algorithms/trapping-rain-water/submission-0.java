class Solution {
    public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int water = 0;
        lmax[0] = height[0];
        rmax[height.length-1] = height[height.length-1];
        for (int i = 1; i < height.length; i++){
         lmax[i] = max(lmax[i - 1], height[i]);
        }
        for(int i = height.length - 2; i >= 0; i--) {
        rmax[i] = max(rmax[i + 1], height[i]);
        }
        for(int i=0;i<height.length;i++)
        water+=min(lmax[i],rmax[i])-height[i];
        return water;
    }
    public int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    public int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
}
