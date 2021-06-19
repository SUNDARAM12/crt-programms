import java.util.*;
public class random{

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    
 int min=sc.nextInt();
 int max=sc.nextInt();
 System.out.println((int)(Math.random()*(max-min+1)+min));  
}
}