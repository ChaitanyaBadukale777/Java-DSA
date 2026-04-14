class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}

// ⚡ Time Complexity
// Best: O(n)
// Worst: O(n²)
// 🎯 Interview Explanation

// Insertion sort builds the sorted array one element at a time by inserting elements into their correct position.
// It is efficient for small or nearly sorted arrays.
