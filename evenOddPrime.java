import java.util.Scanner;
  
  public class evenOddPrime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter a number :-  ");
          int n = scn.nextInt();
          scn.close();
          if(prime(n)){
              System.out.println("prime");
          }
          if(n%2==0){
              System.out.println("even");
          } else 
          System.out.println("odd");

  }

public static boolean prime(int n){
    int count=0;
    for(int i =1;i<n;i++){
        if(n%i==0)
        count++;
    }
    if(count==1){
        return true;
    } else 
    return false;
}
}
