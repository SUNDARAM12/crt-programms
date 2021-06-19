import java.util.Scanner;
  
  public class youngest{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("enter the age of 1st brother :-  ");
          int n1 = scn.nextInt();
            System.out.print("enter the age of 2nd brother :-  ");
               int n2 = scn.nextInt();
                System.out.print("enter the age of 3nd brother :-  ");
                   int n3 = scn.nextInt();
                scn.close();
                if(n1<n2 && n1<n3){
                  System.out.print("1st  is youngest");
                } else if(n2<n1 || n2<n3) {
                  System.out.print("2nd  is youngest");
                } else {
                  System.out.print("3rd  is youngest");
                }
  }
}
