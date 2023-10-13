class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        int n=cost.length;
        Arrays.fill(dp,-1);
       
        
        for(int i=0;i<dp.length;i++){
            if(i<2){
                dp[i]=cost[i];
            }
            else{
                dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
            }
        }
        return Math.min(dp[n-1],dp[n-2]);

        // int one=0;
        // int two=0;
        // for(int i=0;i<n;i++){
        //     if(i<2) dp[i]=cost[i];
        //     else{
        //     one=cost[i]+dp[i-1];
        //     two=cost[i]+dp[i-2];
        //     dp[i]=Math.min(one,two);
        // }}
        // return Math.min(dp[n-1],dp[n-2]);


    }
    
}