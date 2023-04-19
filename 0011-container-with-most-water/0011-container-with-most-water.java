class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int heightVar = (height[i] > height[j] ? height[j] : height[i]);
            int areaVar = heightVar * (j - i);
            if (areaVar > area)
                area = areaVar;
            while (height[i] <= heightVar && i < j) i++;
            while (height[j] <= heightVar && i < j) j--;
        }
        return area;
    }
}