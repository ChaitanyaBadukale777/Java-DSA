import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
