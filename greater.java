import java.util.Scanner;
  
  public class greater{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter the 1st number :-  ");
              int n1 = scn.nextInt();
              System.out.print("enter the 2nd number :-  ");
                int n2 = scn.nextInt();
                scn.close();
       if(n1>n2){
           System.out.print(n1 +" is greater");
       } 
       else if (n2>n1) {
           System.out.print(n2 +" is greater");
       } else {
        System.out.print("both are same");
       }
  }
}