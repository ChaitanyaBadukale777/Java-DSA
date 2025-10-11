public class SubArraySum {

    public static long sumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * (i + 1) * (n - i);
            sum += contribution;
        }
        return sum;

    }

    // public static void main(String[] args) {
    //     int[] a = {1, 2, 3};
    //     long total = SubArraySum.sumOfAllSubarrays(a); // total = 20
    //     // subarrays: [1]=1, [1,2]=3, [1,2,3]=6, [2]=2, [2,3]=5, [3]=3 => sum=20
    //     System.out.println("Sum of all subarrays: " + total);
    // }
}