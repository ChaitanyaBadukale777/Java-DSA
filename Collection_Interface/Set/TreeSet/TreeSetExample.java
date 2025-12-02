import java.util.TreeSet;

public class TreeSetExample {
public static void main(String args[]){
    TreeSet<Integer> numbers = new TreeSet<>();
    
        numbers.add(10);
        numbers.add(4);
        numbers.add(70);
        numbers.add(40);
        numbers.add(20);
        
        System.out.println("Treeset" + numbers);
        
        numbers.remove(10);
        System.out.println("After removing 10 " + numbers);
        
        System.out.println("Smallest Element: " + numbers.first());
        
        System.out.println("Largest Element: " + numbers.last());
    }
}
