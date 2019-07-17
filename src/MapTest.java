
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MapTest {
    public static void main(String[] args) {

        ArrayList<String> csStud=new ArrayList<>();
        ArrayList<String> itStud=new ArrayList<>();
        csStud.add("AA"); csStud.add("BB");
        itStud.add("PP"); itStud.add("QQ");
        
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        map.put("cs", csStud);
        map.put("it", itStud);
        
        System.out.println("Branch To View : ");
        Scanner sc=new Scanner(System.in);
        String branch=sc.next();
        
        ArrayList<String> list=map.get(branch);
        
        out.println(list);
        
        
        
        
        
        
        
        
        
        
                
        
    }
}
