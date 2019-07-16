
import java.util.HashSet;
import java.util.Stack;

public class CityFilter {

    public static Stack<HashSet<String>> getCities(String... cities) {
        //ArrayList<String> dcity = new ArrayList<>();
        HashSet<String> dcity=new HashSet<>();
        HashSet<String> nondcity=new HashSet<>();
        
        for (String city : cities) {
            if (city.startsWith("d")) {
                dcity.add(city);
            }else{
                nondcity.add(city);
            }
        }
        
        Stack<HashSet<String>> allcities=new Stack<>();
        allcities.push(dcity);
        allcities.push(nondcity);
        
        return allcities;
    }

    public static void main(String[] args) {
        Stack<HashSet<String>> allcities = getCities("indore", "pune", "mumbai", "delhi", "dewas", "dehradoon","delhi");
        
        HashSet<String> nond=allcities.pop();
        System.out.println(nond);
        
        HashSet<String> dcities=allcities.pop();
        System.out.println(dcities);
        
        
        
    }
}
