class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}


// ⚡ Time Complexity
// Best: O(n)
// Worst: O(n²)
// 🎯 Interview Explanation (3 lines)

// Bubble sort repeatedly swaps adjacent elements if they are in the wrong order. 
// An optimization is added using a swapped flag to stop early if the array is already sorted.
// It is simple but inefficient for large datasets.
