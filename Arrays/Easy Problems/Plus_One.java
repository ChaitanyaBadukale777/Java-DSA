// Problem Number 66: Plus One
// Approach: Simple Iteration from the end 

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Dry Run

// Input: digits = [9, 9, 9]
// Start from last index:
// i=2 → digits[2] = 9 → becomes 0, carry over
// i=1 → digits[1] = 9 → becomes 0, carry over
// i=0 → digits[0] = 9 → becomes 0, carry over
// Finished loop but still carry left → create new array [1, 0, 0, 0]
// Answer = [1,0,0,0]