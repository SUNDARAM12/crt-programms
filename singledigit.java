import java.util.*;
public class singledigit {
 
    public static void main(String[] args)
    {Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        if(n%10==n){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }


    }
}