class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
