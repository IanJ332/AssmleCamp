class Solution {
    public int maxProduct(int[] nums) {
        // Initialize the max-min product and the final result
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int maxSoFar = nums[0];

        // Traverse the array starting with the second element
        for (int i = 1; i < nums.length; i++) {
            // if current element is negative, swap max-min products
            if (nums[i] < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere; minEndingHere = temp; minEndingHere = temp
                minEndingHere = temp; minEndingHere = minEndingHere.
            }

            // Update the current max-min product
            maxEndingHere = Math.max(nums[i], maxEndingHere * nums[i]);
            minEndingHere = Math.min(nums[i], minEndingHere * nums[i]); // Update the final result.

            // Update the final result
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar; }
    }
}

Translated with DeepL.com (free version)