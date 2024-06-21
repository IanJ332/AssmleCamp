import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return null;
        }
        Set<Integer> hashNums = new HashSet<>();
        int[] finalResult = new int[2]; 

        
        for(int i = 0; i < nums.length; i++){
            if(hashNums.contains(target - nums[i])){

                finalResult[0] = i;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == target - nums[i]){

                        finalResult[1] = j;
                        
                    }
                }
            }else{return null;}   
        }
        return finalResult;
    //     for (int i = 0; i < nums.length; i++) {
    //         int remain = target - nums[i];
    //         if (hashNums.contains(remain)) {
    //             finalResult[0] = i;
    //             for (int j = nums.length - 1; j >= 0; j--) {
    //                 if (nums[j] == remain && j != i) {
    //                     finalResult[1] = j;
    //                     return finalResult;
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }

    // private static Integer[] convertToIntegerArray(int[] array) {
    //     Integer[] result = new Integer[array.length];
    //     for (int i = 0; i < array.length; i++) {
    //         result[i] = array[i]; 
    //     }
    //     return result;
    // }
    }
}