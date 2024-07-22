class Solution {
    public int[] twoSum(int[] nums, int target) {
        int counter1 = 0;
        int counter2 = nums.length - 1;
        int[] finalResult = new int[2];

        while(counter1 < counter2){
            int sum = nums[counter1] + nums[counter2];
            if(sum < target){
                counter1++;
            } else if(sum > target){
                counter2--;
            } else {
                finalResult[0] = counter1;
                finalResult[1] = counter2;
                break;
            }
        }
        return finalResult;
    }
}
