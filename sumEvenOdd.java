import java.util.Scanner;

public class sumEvenOdd {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a number :-");
        int n = scn.nextInt(); 
        scn.close();
        int evenSum=0;
        int oddSum=0;
        for(int i =0;i<=n;i++){
        if(i%2==0){
            evenSum = evenSum + i;
            
        } else 
           oddSum=oddSum+i;
        
    }
    System.out.println(evenSum);
    System.out.println(oddSum);
    }
}

