// Approach 1: Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
        
    }
}


// Time Complexity: O(n^2)
// Space Complexity: O(1)



// Dry Run
// i = 0 → nums[0] = 2
// j = 1 → nums[1] = 7 → 2 + 7 = 9 ✅ match found
// → return {0, 1}

// 💡 Since condition is true, method immediately returns {0, 1}.



// Short Explanation

// Outer loop (i) picks one number.
// Inner loop (j) picks the next numbers after i.
// Each pair is checked if they add up to target.
// First valid pair indices are returned.
// If no pair exists, returns empty array {}.