class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}

// Linear Search sequentially checks each element of the array until the target is found or the array ends.
// It does not require the data to be sorted and is simple to implement. The time complexity is O(n) in the worst and average case,
// and O(1) in the best case when the element is found at the beginning. It is efficient for small or unsorted datasets but not suitable for large inputs.

// Linear Search has:

// 👉 Best Case: O(1) — element found at first position
// 👉 Average Case: O(n) — element may be anywhere
// 👉 Worst Case: O(n) — element at last or not present
