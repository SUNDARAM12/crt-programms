import java.util.Scanner;
public class leapyearbetween{

public static void main(String[] args)
{

Scanner sc = new Scanner (System.in);
System.out.print("enter the starting and ending year respectively :- ");
int start=sc.nextInt();
int end=sc.nextInt();
sc.close();
for(int i=start;i<=end;i++){
    if(((i % 4 == 0) && (i % 100!= 0)) || (i%400 == 0)){
        System.out.println(i);
    }

}

}
}