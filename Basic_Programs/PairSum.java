import java.util.*;

class PairSum{
    public static void main(String args[]){
        int[] a = {2, 4, 3, 1, 6, 7};
        int target = 13;

        HashSet<Integer> set = new HashSet<>();

        for(int x : a){
            int need = target - x;
            if(set.contains(need)){
                System.out.println(need + " " + x);
                return;
            }
            set.add(x);
        }
    }
}