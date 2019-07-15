import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stk=new Stack();
        stk.push("AB"); stk.push("CD");
        stk.push("EF"); stk.push("GH");
        stk.push("IJ");
        
        
        
        
        /*
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5; i++){
            System.out.println("Student : "+i);
            String name=sc.next();
            stk.push(name);
        }
        */
        System.out.println("Student's List");
        System.out.println(stk);
        String res=(String) stk.pop();
        System.out.println("Student Popped : "+res);
        System.out.println(stk);
        res=(String) stk.pop();
        System.out.println("Student Popped : "+res);
        System.out.println(stk);
        res=(String) stk.pop();
        System.out.println("Student Popped : "+res);
        
        
    }
}
