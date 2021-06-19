import java.util.Scanner;
  
  public class length{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter a number :-  ");
          int n = scn.nextInt();
          scn.close();
          int count =0;
          while(n!=0){
            int r=n%10;
              count++;
              n=n/10;
          }
          System.out.print("length of given number is "+count);
    }
}
