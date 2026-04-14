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
