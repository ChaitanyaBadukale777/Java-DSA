import java.util.HashMap;

public class CountFreq {
    public static void main(String args[]){
        String str = "hello";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
