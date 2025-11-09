public class Main {
    public static int mySqrt(int x) {
        if(x < 0) return x;

        long start = 1, end = x, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if(mid == x / mid)
                return (int) mid;
            else if(mid < x / mid)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return (int) end;
        }

        public static void main(String[] args) {
            int x = 8;
            System.out.println("Square root of " + x + " is: " + mySqrt(x));
        }
    }

// Time Complexity : O(log x)
// Space Complexity : O(1)