class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i  = 0; i < nums.length; i++){
            for(int j  = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
}

// above is brute-force time complexity of O(n^2)

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

//use hashset seen which will lead code with a monitor tech, which store each number in array nums, if we store that before then it means it is duplicate return true, if after we go through whole array we still cannot did not detect any same number then return false.
