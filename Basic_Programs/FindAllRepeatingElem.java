import java.util.HashMap;

public class FindAllRepeatingElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // print repeating elements
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}


// O/P : 1 2
