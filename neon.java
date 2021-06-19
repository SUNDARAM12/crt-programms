import java.util.Scanner;
  
  public class neon{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter a number :-  ");
          int n = scn.nextInt();
          scn.close();
          int sum=0;
          int sq=n*n;
          while(sq!=0){
              int r = sq%10;
              sum=sum + r;
              sq=sq/10;
            }
            if(n==sum)
            System.out.print(n+" is a neon number");
            else 
            System.out.print(n+"  is not a neon number");
  }
}
