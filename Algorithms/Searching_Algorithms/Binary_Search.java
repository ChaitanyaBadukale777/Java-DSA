class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        System.out.println("Not Found");
    }
}


// Explanation

// Binary Search works on a sorted array by repeatedly dividing the search space into halves. I initialize two pointers left = 0 and right = n - 1, 
// then compute the middle index using mid = left + (right - left) / 2 to avoid overflow. I compare the target with arr[mid]—if equal, return the index;
// if the target is greater, I move left = mid + 1, otherwise right = mid - 1. This process continues until the element is found or the search space becomes invalid, 
// achieving O(log n) time complexity with constant space.

// ⚡ Logic in 4 simple points
// Start with two pointers → left (start) and right (end)
// Find middle → mid = (left + right) / 2
// Compare:
// if target == mid → found
// if target > mid → search right
// else → search left
// Repeat until found


// Line-by-line simple explanation
// left = 0, right = n-1 → full array
// mid → center index
// arr[mid] == target → return index
// arr[mid] < target → ignore left half
// arr[mid] > target → ignore right half
