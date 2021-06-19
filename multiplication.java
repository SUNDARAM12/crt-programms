import java.util.Scanner;

public class multiplication {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number :-");
        int n = scn.nextInt();
        scn.close();
     for(int i=1;i<11;i++){
         System.out.printf("%d * %d = %d \n", n, i, n * i);
     }
 }
}
