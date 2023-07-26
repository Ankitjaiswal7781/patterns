package Patterns;
import java.util.*;
public class SolidRectanle {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows");
        int a=sc.nextInt();
        System.out.println("number of rows");
    int b= sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
