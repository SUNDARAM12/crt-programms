import java.util.*;
  
  public class game{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
          Random rand = new  Random();
          int banu_money = 10;
          while(banu_money!=0){
              System.out.print("banu's number is :- ");
              int b_num=scn.nextInt();
              int rand_num = rand.nextInt(10);
            
              System.out.println("Random Number is :"+rand_num);
              if(b_num==rand_num){
                  banu_money += 1;
                  System.out.println("Money left :- "+banu_money);

              }
              else if (b_num!=rand_num){
                  banu_money-=1;
                  System.out.println("money left :- "+banu_money);
              }
            }
            System.out.println(banu_money);
            if(banu_money==20){
                System.out.println("WIN");
            }
            else if ( banu_money==0){
                System.out.println("LOST");
            }
        }
     }