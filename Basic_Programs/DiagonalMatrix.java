public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int n = 10;

        for (int i = 0; i < 5; i++) {
            arr[i][i] = n;
            n += 10;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
