
import java.util.LinkedList;
import java.util.Stack;


public class GenColl {
    public static void main(String[] args) {

        Stack<String> stk1=new Stack<>();
        stk1.push("ab");
        stk1.push("cd");
        stk1.push("ef");
        //stk1.push(10);
        //stk1.push(2.1);
        String res1=stk1.pop();
        System.out.println(res1);
        
        Stack<Integer> stk2=new Stack<>();
        stk2.push(10);
        stk2.push(20);
        stk2.push(30);
        //stk2.push("ab");
        Integer res2=stk2.pop();
        System.out.println(res2);
        
        Stack stk3=new Stack();
        stk3.push(60);
        stk3.push(70);
        stk3.push("aa");
        stk3.push("bb");
        String res3=(String) stk3.pop();
        System.out.println(res3);
        
        LinkedList list;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
