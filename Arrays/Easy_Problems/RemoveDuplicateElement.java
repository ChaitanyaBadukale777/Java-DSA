import java.util.*;
public class RemoveDuplicateElement {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 3, 5, 6, 7};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        
        for(int x : arr){
            if(!seen.add(x))
                dup.add(x);
        }
        System.out.println("Duplicate Elements: " + dup);
    }
}
