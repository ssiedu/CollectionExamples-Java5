import java.util.ArrayList;
import java.util.Stack;


public class Calculations {

    public static Data calc(int n){
        Data data=new Data();
        data.setSquare(n*n);
        data.setCube(n*n*n);
        return data;
    }
    
    /*
    public static ArrayList<Integer> calc(int n){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(n*n); 
        list.add(n*n*n);
        list.add(n*n*n*n);
        return list;
    }
    */
    /*
    public static Stack<Integer> calc(int n) {
        Stack<Integer> stk=new Stack<>();
        stk.push(n*n);
        stk.push(n*n*n);
        return stk;
    }
    */
    /*
    public static int[] calc(int n) {
        int ar[]=new int[2];
        ar[0]=n*n;
        ar[1]=n*n*n;
        return ar;
    }
    */
    public static void main(String[] args) {
      
        Data result=calc(4);
        int sq=result.getSquare();
        int cb=result.getCube();

        System.out.println(sq);
        System.out.println(cb);
        
        
        /*
            ArrayList<Integer> result=calc(3);
            
            for(Integer item:result){
                System.out.println(item);
            }
        */    
            //System.out.println(result.get(0));
            //System.out.println(result.get(1));
            //System.out.println(result.get(2));
        
        
        
            /*
            Stack<Integer> resStk=calc(5);
            int cube=resStk.pop();
            int square=resStk.pop();
            System.out.println(square);
            System.out.println(cube);
            */
            
            /*
            int res[]=calc(10);
            System.out.println(res[0]);
            System.out.println(res[1]);
            */
        
    }

}
