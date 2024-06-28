class Solution {
    public int maxArea(int[] height) {
        if (height.length == 0 || height.length == 1) return 0; 
        
        int a = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int c = (r - l) * Math.min(height[l], height[r]);
            if(c > a){
                a = c;
            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return a;
    }
}
