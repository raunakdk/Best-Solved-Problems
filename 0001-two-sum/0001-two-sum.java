class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int num =nums[i];
            int mr= target -num;
            if(mp.containsKey(mr)){
                ans[0]=mp.get(mr);
                ans[1]= i;
                return ans;// ans
// put in map
            }
            mp.put(nums[i], i);
        }
        return ans;
        
    }
}
