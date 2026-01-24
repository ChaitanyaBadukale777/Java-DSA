// Problem Number 27: Remove Element
// Approach: Two Pointers

import java.util.*;

class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        int val = 3;

        int index = 0;

        // Move required elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index++] = arr[i];
            }
        }

        // Create final array of correct size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        // Print final array
        System.out.println(Arrays.toString(result));
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


// 🟢 Logic of Remove Element:

// We want to remove all numbers equal to val.
// Instead of actually deleting, we move all the good numbers (not equal to val) to the front of the array.
// We keep a counter k → this tells how many good numbers we have placed at the front.

// At the end:
// The first k numbers of the array are valid (not equal to val).
// The rest of the array doesn’t matter.
