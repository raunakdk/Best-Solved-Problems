class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int Lm[] = new int[n];
        Lm[0]=height[0];
        for(int i=1;i<n;i++){
            Lm[i]=Math.max(height[i],Lm[i-1]);
        }
        int Rm[]= new int[n];
        Rm[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            Rm[i]=Math.max(height[i],Rm[i+1]);
        }

        int trw=0;
        for(int i=0;i<n;i++){
            int wl= Math.min(Rm[i],Lm[i]);
            trw+= wl-height[i];
            
        }
        return trw;

        
    }
}