public class TwoDArrayTraverse {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int n = 10;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                arr[i][j] = n;
                n += 10;
            }

        for (int[] row : arr) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}


// Output:
// 10 20 30
// 40 50 60
// 70 80 90