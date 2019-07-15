
public class BoxDemo {

    public static void show(Object p) {
        System.out.println(p);
    }

    public static void main(String[] args) {
        show(new String("abc"));
        show(new StringBuffer("xyz"));
        show(10);
        show(3.4);
    }
}
