// package Accenture.Java.Programs;

public class ReplaceRepeats {
    public static void main(String args[]) {
        String s = "aaabbcdd";
        boolean[] visited = new boolean[256];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!visited[ch]) {
                int count = 0;
                for(int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) count++;
                }
                visited[ch] = true;
                if(count > 1) 
                    System.out.print(getSymbol(ch));
                else 
                    System.out.print(ch);
                }
            }
        }
        static char getSymbol(char c) {
            char[] symbols = {'@', '#', '$', '%', '&'};
            return symbols[c - 'a'];
    }
}
