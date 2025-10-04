// Problem 26: Remove Duplicates from Sorted Array

// Approach: Two Pointers

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) 
        return 0;
        int n = nums.length;
        if(n <= 1)
        return n;

        int write = 1;

        for(int read = 1; read < n; read++) {
            if(nums[read] != nums[write - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
        
    }
}




// Complexity

// Time: O(n) — one pass through the array.
// Space: O(1) — only a couple of scalar variables.


// Dry run example

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Initial: write = 1
// read = 1: nums[1]=0, nums[write-1]=nums[0]=0 → equal → do nothing.
// read = 2: nums[2]=1, nums[write-1]=0 → different → nums[1]=1, write→2 → array becomes [0,1,1,1,1,2,2,3,3,4]
// read = 3: nums[3]=1, nums[write-1]=nums[1]=1 → equal → skip
// read = 4: nums[4]=1 → skip
// read = 5: nums[5]=2, nums[write-1]=1 → different → nums[2]=2, write→3 → [0,1,2,1,1,2,2,3,3,4]
// read = 6: nums[6]=2 → skip
// read = 7: nums[7]=3, different → nums[3]=3, write→4 → [0,1,2,3,1,2,2,3,3,4]
// read = 8: nums[8]=3 → skip
// read = 9: nums[9]=4, different → nums[4]=4, write→5 → [0,1,2,3,4,2,2,3,3,4]
// Return write = 5. The first 5 elements [0,1,2,3,4] are the unique values.

