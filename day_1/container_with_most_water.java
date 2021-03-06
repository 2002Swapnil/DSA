class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxwater=0;
        while(i<j){
            int water = j-i;
            int heightofcont = Math.min(height[i],height[j]);
            
            maxwater = Math.max(maxwater,water*heightofcont);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return maxwater;
    }
}