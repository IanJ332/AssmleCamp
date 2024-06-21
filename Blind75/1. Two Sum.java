
import java.util.HashSet;

// Solution_1: Runtime 5 ms | Beats 57.27% Memory 44.65MB Beats 66.23%
// Solution_2: Runtime 4 ms | Beats 62.58% Memory 44.90MB Beats 34.88%



class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Solution_1: HashSet<Integer> hashNums = new HashSet<>(Arrays.asList(convertToIntegerArray(nums)));
        // Solution_2:
        Set<Integer> hashNums = new HashSet<>();
        for(int num : nums){
            hashNums.add(num);
        }
        // Rest of the solution:
        int[] finalResult = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (hashNums.contains(remain)) {
                finalResult[0] = i;
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[j] == remain && j != i) {
                        finalResult[1] = j;
                        return finalResult;
                    }
                }
            }
        }
        return null;
    }

    private static Integer[] convertToIntegerArray(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i]; 
        }
        return result;
    }
}
