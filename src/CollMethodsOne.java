
import java.util.ArrayList;


public class CollMethodsOne {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        //System.out.println(list.isEmpty());
        //System.out.println(list.size());
        System.out.println(list);
        
        System.out.println(list.contains("four"));
        
        list.remove("four");
        
        System.out.println(list.contains("four"));
        
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
/*
    isEmpty,size,add,remove, contains, 
    


*/

