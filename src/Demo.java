import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        System.out.println(list);
        list.addFirst("GH");
        System.out.println(list);
        list.addLast("IJ");
        System.out.println(list);
        list.add(2,"KL");
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(2);
        System.out.println(list);
        
        
        
        
        
        
        
        
        
        
    }
}
