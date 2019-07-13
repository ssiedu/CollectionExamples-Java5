
import java.util.Scanner;


public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int x[]={15,25,35};
        
        int ar[]=new int[5];
        
        for(int i=0; i<5; i++){
            System.out.println("Enter Number : "+(i+1));
            ar[i]=sc.nextInt();
        }
        System.out.println("Your Elements : ");
        for(int tmp:ar){
            System.out.println(tmp+"\t");
        }
        System.out.println("");
        
    }
}
