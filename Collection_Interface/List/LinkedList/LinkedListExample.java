import java.util.LinkedList;

public class Geeks {
    public static void main(String args[]){
        LinkedList<String> l = new LinkedList<>();
        
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        
        System.out.println(l);
        System.out.println("Size : " + l.size());
        

        String t = new String("five");
        l.remove(t);
        
        System.out.println("Final List : " + l);
    }
}