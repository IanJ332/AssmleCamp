class Solution {
    public static void rotate(int[] nums, int k) {
     int n = nums.length;
     k = k % n; // In case k is larger than n

     // Create a new array with extra k spaces at the beginning
     int[] temp = new int[n + k];

     // Copy the last k elements to the beginning of the new array
     for (int i = 0; i < k; i++) {
         temp[i] = nums[n - k + i];
     }

     // Copy the original array elements to the new positions
     for (int i = 0; i < n; i++) {
         temp[k + i] = nums[i];
     }

     // Copy the relevant part back to the original array
     for (int i = 0; i < n; i++) {
         nums[i] = temp[i];
     }
 }
}
class Solution2 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is larger than n
        reverse(nums, 0, n - 1);    //Invert the whole array.
        reverse(nums, 0, k - 1);    //Reverse the first k elements.      Which is array[0] till array[k - 1]
        reverse(nums, k, n - 1);    //Invert the remaining n-k elements. Invert rest or them
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];   
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

// Using a Temporary Array:

// Time Complexity: O(n)
// Space Complexity: O(k)

// In-place Rotation Using Three Reversals:
// Time Complexity: O(n)
// Space Complexity: O(1)

// In all, Using Three Reversals is BETTER/
