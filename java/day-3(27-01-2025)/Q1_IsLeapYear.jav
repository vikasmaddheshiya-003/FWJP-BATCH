
import java.util.Scanner;
class Q1_IsLeapYear
{

  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

    int year=sc.nextInt();
     String result= (year%4==0 && year %100!=0) ? year+ " is leap yaer ": year+ " is not leap yaer ";
     System.out.print(result);
  
}
}

