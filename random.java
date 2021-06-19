import java.util.*;
public class random{

public static void main(String[] args)
{
    Scanner scn=new Scanner(System.in);
    
 int min=scn.nextInt();
 int max=scn.nextInt();
 System.out.println((int)(Math.random()*(max-min+1)+min));  
}
}