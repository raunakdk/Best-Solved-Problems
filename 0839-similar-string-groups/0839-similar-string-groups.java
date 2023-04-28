class Solution {
    private String[] strs;
    private boolean[] visited;
    private int m;

    public int numSimilarGroups(String[] strs) {
        this.strs = strs;
        visited = new boolean[strs.length];
        m = strs[0].length();
        int count = 0;
        for(int i = 0; i < strs.length; ++i){
            if(!visited[i]){
                dfs(i, i + 1);  //Comparisons will start from i+1,
                                //because the strings before i have 
                                //been added to their respective groups
                ++count;
            }
        }
        return count;
    }

    private void dfs(int i, int start){
        visited[i] = true;
        for(int j = start; j < strs.length; ++j)
            if(!visited[j] && isSimilar(i, j))
                dfs(j, start);
    }

    private boolean isSimilar(int i, int j){
        int c = 0;
        for(int k = 0; k < m; ++k)
            if(strs[i].charAt(k) != strs[j].charAt(k) && ++c > 2)
                return false;
        return c <= 2;
    }
}