public class MoveZerosToEnd {
    public static void main(String args[]) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int[] temp = new int[arr.length];
        int index = 0;

        for(int num : arr)
            if(num != 0)
            temp[index++] = num;
        

        System.out.print("Array after moving zeros to the end: ");
        for(int x : temp)
            System.out.print(x + " ");
    }
}