import java.util.Scanner;
  
  public class sumPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter the number :-  ");
              int n = scn.nextInt();
              scn.close();
              int sum=0;
              for(int s=1;s<=n;s++){
               int count = 0;
              for (int i = 1; i < s;i++) {
              if (s % i== 0) {
                 count++;
                   }
                }
            if (count == 1) {
                int storePrime=s;
                sum=sum + storePrime ;
               }
            }
            System.out.println(sum);
                            
          }
  
   }