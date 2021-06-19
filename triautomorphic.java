import java.util.Scanner;
public class triautomorphic {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        sc.close();
        int sq_num = num*num*3;  
 
        String str_num = Integer.toString(num);  
        String square = Integer.toString(sq_num);  
 
        if(square.endsWith(str_num))  
            System.out.println(" Tri-Automorphic Number.");
        else
            System.out.println("Not an Tri-Automorphic Number.");
    }
}
