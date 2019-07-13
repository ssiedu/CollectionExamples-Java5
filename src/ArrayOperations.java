
import java.util.Arrays;
import java.util.Scanner;


public class ArrayOperations {
    public static void main(String[] args) {
        /*
        String s[]={"bhopal","agra","delhi","mumbai","chennai"};
        Arrays.sort(s);
        for(String tmp:s){
            System.out.print(tmp+" ");
        }
        */
        
        int ar[]={10,5,22,4,16,19,90,105,24};
        for(int tmp:ar){
            System.out.print(tmp+"  ");
        }
        System.out.println("After Sorting : ");
        Arrays.sort(ar);
        for(int tmp:ar){
            System.out.print(tmp+"  ");
        }
        System.out.println();
        System.out.println("Element To Be Searched : ");
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        int index=Arrays.binarySearch(ar, item);
        if(index<0){
            System.out.println(item+" not available");
        }else{
            System.out.println("Index of "+item+" is "+index);
        }
        
    }
}
