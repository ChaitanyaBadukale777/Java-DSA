public class CharFrequencySymbol1 {
    public static void main(String[] args) {
        String s = "aaaccbbb";
        boolean[] visited = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch]) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch) count++;
                }
                visited[ch] = true;
                System.out.print(ch + getSymbol(count));
            }
        }
    }

    static String getSymbol(int n) {
        return "!@#$%".charAt(n - 1) + "";
    }
}


// Rule

// Input
// aaaccbbb

// Count frequency of each character in order of appearance

// Replace frequency with symbols:

// 1 → !

// 2 → @

// 3 → #

// 4 → $

// 5 → %

// Output only character + symbol
// a#c#b#
