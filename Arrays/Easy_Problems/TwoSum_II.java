public class TwoSum_II{
    public static void main(String args[]){
        int[] num = {3, 4, 5, 6, 9};
        int target = 10;
        
        int left = 0, right = num.length - 1;
        
        while (left < right){
            int sum = num[left] + num[right];
            
            if(sum == target) {
                System.out.println("Indexes: " + (left + 1) + ", " + (right + 1));
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}

// Output:
// Indexes: 2, 4