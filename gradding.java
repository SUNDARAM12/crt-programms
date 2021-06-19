import java.util.*;
public class gradding{
    public static void main (String[] args){
        int marks[] = new int[5];
        int i;
        float total=0, avg=0;
        Scanner scanner = new Scanner(System.in);
		for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
          if(marks[i]<35){
             System.out.println("failed!!!");
         } if(marks[i]>=35) {
               total = total + marks[i];
               avg = total/(float)5;

          }
        }
        System.out.println(total);
        System.out.println(avg);
       
    }
}