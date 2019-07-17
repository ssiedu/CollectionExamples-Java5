
import static java.lang.System.out;
import java.util.HashMap;


public class MapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map=new HashMap<>();
        
        map.put(1, "Sunday");
        map.put(2, "Monday");
        map.put(3, "Tuesday");
        map.put(4, "Wedenesday");
        
        
        out.println(map.get(1));
        
        
        
    }    
}
