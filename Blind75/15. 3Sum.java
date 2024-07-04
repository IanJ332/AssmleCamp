import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums.length < 3) {
            return result;
        }

        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(Arrays.asList(nums[0], nums[1], nums[2]));
            }
            return result;
        }

        Arrays.sort(nums); // 排序数组以便于后续操作
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 跳过重复元素

            int pointer1 = i + 1;
            int pointer2 = nums.length - 1;

            while (pointer1 < pointer2) {
                int sum = nums[i] + nums[pointer1] + nums[pointer2];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[pointer1], nums[pointer2]));
                    while (pointer1 < pointer2 && nums[pointer1] == nums[pointer1 + 1]) pointer1++; // 跳过重复元素
                    while (pointer1 < pointer2 && nums[pointer2] == nums[pointer2 - 1]) pointer2--; // 跳过重复元素
                    pointer1++;
                    pointer2--;
                } else if (sum < 0) {
                    pointer1++;
                } else {
                    pointer2--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }
}
