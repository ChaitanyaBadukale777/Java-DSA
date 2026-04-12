import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "hello";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}

// O/P

// h = 1
// e = 1
// l = 2
// o = 1
