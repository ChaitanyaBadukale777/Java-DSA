import java.util.Arrays;

class Merge_Two_Array {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        int b[] = {11, 22, 33, 44};

        int c[] = new int[a.length + b.length];   
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}
