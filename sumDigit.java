import java.util.Scanner;
  
  public class sumDigit{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter a number :- ");
          int n = scn.nextInt();
          scn.close();
          int sum =0;
          while(n!=0){
              int r=n%10;
              sum=sum+r;
              n=n/10;
          }
          System.out.print("sum of given number is "+sum);
  }
}