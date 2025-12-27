public class LargestNum {
    public static void main(String args[]) {
        int[] arr = {2, 4, 7, 9, 12, 3, 5, 8, 65};
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];        
        }
        System.out.println("Largest Number: " + max);
    }
}

// Output:
// Largest Number: 65