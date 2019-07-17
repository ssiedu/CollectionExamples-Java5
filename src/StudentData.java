
import java.util.HashMap;
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {
        Student s1 = new Student(111, "AA", "CS", 3);
        Student s2 = new Student(112, "BB", "IT", 1);
        Student s3 = new Student(113, "CC", "MECH", 4);
        Student s4 = new Student(114, "DD", "CIVIL", 5);
        Student s5 = new Student(115, "EE", "EC", 2);

        //storing the objects in map
        HashMap<String, Student> map = new HashMap<>();
        map.put("111", s1);
        map.put("112", s2);
        map.put("113", s3);
        map.put("114", s4);
        map.put("115", s5);

        System.out.println("Enter Rollno To Be Searched : ");
        Scanner sc = new Scanner(System.in);
        String rn = sc.next();

        Student stud = map.get(rn);
        System.out.println("___________________________");
        System.out.println(stud.getRno());
        System.out.println(stud.getName());
        System.out.println(stud.getBranch());
        System.out.println(stud.getSem());
        System.out.println("___________________________");
    }
}
