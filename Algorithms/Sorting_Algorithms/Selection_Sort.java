class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

// ⚡ Time Complexity
// Best/Worst: O(n²)



// 🎯 Interview Explanation

// Selection sort selects the minimum element from the unsorted portion and places it at the correct position.
// It performs fewer swaps compared to bubble sort but still has quadratic time complexity.
