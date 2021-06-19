import java.util.Scanner;
public class birthdayLeapyear{

public static void main(String[] args)
{

Scanner sc = new Scanner (System.in);
System.out.print("enter birthday year :- ");
int year=sc.nextInt();
sc.close();
    if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
        System.out.println("birthday year is leapyear");
    } else
    System.out.print("birthday year is not leapyear");

}
}