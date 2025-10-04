// Problem Number 35: Search Insert Position
// Approach: Linear Search
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

// Time Complexity: O(n) - We traverse the array once.
// Space Complexity: O(1) - We use a constant amount of extra space.

// (Dry Run)
// Input: nums = [1,3,5,6], target = 5
// Step by step:
// i=0: nums[0] = 1 < 5 → continue.
// i=1: nums[1] = 3 < 5 → continue. 
// i=2: nums[2] = 5 >= 5 → return index 2.
// Output: 2