
import java.util.ArrayList;
import java.util.HashSet;


public class Trial {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("A"); list.add("B");
        list.add("C"); list.add("A");
        HashSet set=new HashSet();
        set.add("A"); set.add("B"); 
        set.add("C"); set.add("A");
        set.add("F"); set.add("G");
        set.add("H");
        
        System.out.println(list);        
        System.out.println(set);        
        
    }
}
