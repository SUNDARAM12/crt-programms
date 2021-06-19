import java.util.*;
public class sunny {
 
    public static void main(String[] args)
    {Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int temp=(int)(Math.sqrt(n+1));
        if(temp*temp==n+1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}