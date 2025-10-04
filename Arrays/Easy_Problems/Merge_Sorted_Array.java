class MergeSortedArraySolutionUnique {
public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) return;
    int[] temp = new int[m];
    System.arraycopy(nums1, 0, temp, 0, m);

    int p = 0;
    int q = 0;   
    int k = 0;   

    while (p < m && q < n) {
        if (temp[p] <= nums2[q]) {
            nums1[k++] = temp[p++];
        } else {
            nums1[k++] = nums2[q++];
        }
    }

    while (p < m) nums1[k++] = temp[p++];
    while (q < n) nums1[k++] = nums2[q++];
}
}

// Time Complexity: O(m + n)
// Space Complexity: O(m)
