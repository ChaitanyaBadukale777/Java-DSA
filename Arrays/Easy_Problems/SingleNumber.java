public class SingleNumber {
    public static int SingleNumber(int[] nums) { 
        int result = 0;
        for(int num : nums)
            result ^= num;   // XOR operation
        return result;
    }
    // public static void main(String[] args) {
    //     int[] arr = {4,1,2,1,2};
    //     System.out.println(SingleNumber(arr));
    // }
}

// Time Complexity: O(n) where n is the number of elements in the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space