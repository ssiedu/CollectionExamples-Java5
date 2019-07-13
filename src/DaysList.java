
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class DaysList {
    public static void main(String[] args) {
        //HashSet days=new HashSet();
        //ArrayList days=new ArrayList();
        //LinkedHashSet days=new LinkedHashSet();
        TreeSet days=new TreeSet();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println(days);
        
    }
}
