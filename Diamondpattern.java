package Patterns;
import java.util.*;
public class Diamondpattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        //upper half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }//stars
            int stars=2*i-1;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//stars
            int stars=2*i-1;
            for(int j=stars;j>=1;j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}
