// CountSpecialChar.java

public class CountSpecialChar{
    public static void main(String args[]){
        String s1 = "hello samir?? where is nayan??,, karthik looking for him!!!";
        int count = 0;

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch!=' ')
                count++;
        }

        System.out.println(count);

    }
}

//Time Complexity: O(n) where n is the length of the string
//Space Complexity: O(1)