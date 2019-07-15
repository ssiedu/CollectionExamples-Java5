
import java.util.Stack;

class Stud{}
public class WCDemo {
    public static void main(String[] args) {
        String e1=new String("indore");
        StringBuffer e2=new StringBuffer("india");
        Stud e3=new Stud();
        
        Stack stk=new Stack();
        stk.push(e1);
        stk.push(e2);
        stk.push(e3);
        stk.push(10);//stk.push(new Integer(10));
        stk.push(2.5);//stk.push(new Double(2.5));
        
        Double d1=(Double)stk.pop();
        System.out.println(d1+2);
        
    }
}
