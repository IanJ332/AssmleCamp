
import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {

    int expectedSum = nums.length*(nums.length + 1)/2;
    int actualSum = 0;
    for (int num : nums) {
        actualSum += num;
    }
    return expectedSum - actualSum;

    }
}


public class Solution2 {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return -1;  // this line will never be reached
    }
}
