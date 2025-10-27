class Vowels2Uppercase {
    public static void main(String args[]) {
        String s1 = "hello i am java developer";
        String s2 = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if(s2.contains(String.valueOf(ch)))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        System.out.println(sb);
    }
}