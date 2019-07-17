
import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(111, "AA", "CS", 3);
        Student s2 = new Student(112, "BB", "IT", 1);
        Student s3 = new Student(113, "CC", "MECH", 4);
        Student s4 = new Student(114, "DD", "CIVIL", 5);
        Student s5 = new Student(115, "EE", "EC", 2);
        list.add(s1); list.add(s2); list.add(s3); 
        list.add(s4); list.add(s5);
        
        System.out.println("Enter Roll Number To Be Searched");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(Student stud:list){
            
            int rno=stud.getRno();
            if(rno==n){
                System.out.println("___________________________");
                System.out.println(stud.getRno());
                System.out.println(stud.getName());
                System.out.println(stud.getBranch());
                System.out.println(stud.getSem());
                System.out.println("___________________________");
            }
        }

        

    }
}
