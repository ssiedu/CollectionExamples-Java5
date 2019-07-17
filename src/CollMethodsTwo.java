
import static java.lang.System.out;
import java.util.ArrayList;


public class CollMethodsTwo {
    public static void main(String[] args) {

        ArrayList<String> js=new ArrayList<>();
        ArrayList<String> ps=new ArrayList<>();
        
        js.add("AAA"); js.add("BBB"); js.add("CCC");
        ps.add("PPP"); ps.add("QQQ"); ps.add("RRR");
        
        out.println("Java Students : "+js);
        out.println("Php Students  : "+ps);
        out.println("______________________________________________________");
      
        js.addAll(ps);
        
        out.println("Java Students : "+js);
        out.println("Php Students  : "+ps);
        out.println("______________________________________________________");
        
        //js.removeAll(ps);
        
        js.retainAll(ps);
        
        
        out.println("Java Students : "+js);
        out.println("Php Students  : "+ps);
        out.println("______________________________________________________");
        
        
        
    }
}
/*
    addAll
        will copy all the elements of one collection
        into another.

    removeAll
        will remove the common elements


    retainAll
        will retain the common elements

*/
