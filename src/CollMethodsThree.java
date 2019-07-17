
import java.util.ArrayList;
import java.util.Iterator;


public class CollMethodsThree {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Php");
        list.add("CPP");
        
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
        
        //Object ar[]=list.toArray();
        //System.out.println(ar[1]);
        
        
        
        
        
        
    }
}
/*
    toArray
    iterator()
    


*/