//  WAP to find the missing number from array

import java.util.Arrays;
class MissingNumber {
    public static void main(String[] args) {
        int a[] = {20, 21, 22, 24, 25, 26, 27};
        Arrays.sort(a);
        int sum = 0;
        for(int i = a[0]; i <= a[a.length - 1]; i++) 
            sum += i;
        for(int i = 0; i < a.length; i++)
            sum -= a[i];
        System.out.println("Missing number is: " + sum);
    }
}
// Output: Missing number is: 23