public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int[] arr) {
        int max = 0, count = 0;

        for (int num : arr) {
            if (num == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
