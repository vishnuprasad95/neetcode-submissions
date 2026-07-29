class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i=0;i<position.length;i++)
        {
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        double fleettime=-1;
        int fleet=0;
        for(int[] car:arr)
        {
        double currentTime = (double)(target-car[0])/car[1];
           if(currentTime>fleettime)
           {
            fleet++;
            fleettime=currentTime;
           } 
        }

        return fleet;
        
    }
}
