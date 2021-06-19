import java.util.Scanner;
  
  public class available{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter a number :-  ");
          int n = scn.nextInt();
          System.out.print("enter the number which would you want to find :- ");
          int n1 = scn.nextInt();
          scn.close();
          while(n!=0){
              int r=n%10;
              if(r==n1){
                  System.out.print("number is persent...");
                  break;
              }
              n=n/10;
         }
         if(n==0)
         System.out.print("number is not persent...");

  }
}