// package Accenture.Java Programs;

public class OddEvenFrequency {
    public static void main(String agrs[]) {
        String s = "aaaccbbb";
        boolean[] visited = new boolean[256];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!visited[ch]) {
                int count = 0;
                for(int j = 0; j < s.length(); j++) {
                    if(s.charAt(j) == ch) count++;
                }
                visited[ch] = true;
                System.out.println(ch + (count % 2 == 0 ? "@" : "#"));
            }
        }
    }
    
}
