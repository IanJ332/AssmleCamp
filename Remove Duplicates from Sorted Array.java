public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int slow = 0; 

        for (int fast = 1; fast < nums.length; fast++) { 
            if (nums[fast] != nums[slow]) { 
                // slow++; 
                // nums[slow] = nums[fast]; 
                nums[slow + 1] = nums[fast];
                slow ++;
            }
        }

        return slow + 1; 
    }
}

// nums = [0,  0, 1, 1, 1, 2, 2, 3, 3, 4]
//          ^  ^                      
//       slow fast      
// When num[slow] not equal to num[fast] means we met a different digit, numbers between are all duplicate:           

// nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
//          ^    ^                      
//       slow   fast    
// enter if condition :
// nums = [0, 1, 1, 1, 1, 2, 2, 3, 3, 4]
//            ^  ^                      
//          slow fast    

// nums = [0, 1, 1, 1, 1, 2, 2, 3, 3, 4]
//            ^           ^                      
//          slow         fast    
// enter if condition :

// nums = [0, 1, 2, 1, 1, 2, 2, 3, 3, 4]
//               ^        ^                      
//              slow     fast    

// nums = [0, 1, 2, 1, 1, 2, 2, 3, 3, 4]
//               ^              ^                      
//              slow           fast                 
// enter if condition :
// nums = [0, 1, 2, 3, 1, 2, 2, 3, 3, 4]
//                  ^              ^                      
//                 slow          fast  

// nums = [0, 1, 2, 3, 1, 2, 2, 3, 3, 4]
//                  ^                 ^                      
//                 slow              fast  
// enter if condition :
// nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
//                     ^              ^                      
//                    slow           fast                  
// Jump out of the `for` loop and ONLY returen array till slow which is `return slow + 1; `

// the final result gonna be like

// nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4] => nums = [0, 1, 2, 3, 4]

// in-place deduplication, TIME 0(n), Space O(1)