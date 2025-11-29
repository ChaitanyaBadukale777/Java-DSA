public class LongestWord {
    public static void main(String[] args) {
        String s = "I love programming a lot";
        String[] arr = s.split(" ");

        String largest = arr[0];
        for(String w : arr) {
            if(w.length() > largest.length()) {
                largest = w;
            }
        }

        System.out.println(largest);
    }
}
