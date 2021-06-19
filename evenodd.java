import java.util.Scanner;

public class evenodd {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number :-");
        int n = scn.nextInt(); 
        scn.close();
        if(n%2==0){
            System.out.print("even");
        } else 
        System.out.print("odd");

    }
}
