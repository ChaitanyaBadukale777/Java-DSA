// Problem Number 27: Remove Element
// Approach: Two Pointers

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// Time Complexity: O(n) - We traverse the array once.
// Space Complexity: O(1) - We use a constant amount of extra space.

// (Dry Run)

// Input:

// nums = [3, 2, 2, 3], val = 3
// Step by step:
// i=0: nums[0] = 3 → equals val → skip.
// i=1: nums[1] = 2 → not val → put it at nums[0]. Now nums = [2, 2, 2, 3], k=1.
// i=2: nums[2] = 2 → not val → put it at nums[1]. Now nums = [2, 2, 2, 3], k=2.
// i=3: nums[3] = 3 → equals val → skip.