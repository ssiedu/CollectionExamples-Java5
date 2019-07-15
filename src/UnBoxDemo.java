
public class UnBoxDemo {

    public static void square(int p) {
        System.out.println(p * p);
    }

    public static void main(String[] args) {
        Integer ob=new Integer(25);
        square(2);
        square(ob);
    }
}
