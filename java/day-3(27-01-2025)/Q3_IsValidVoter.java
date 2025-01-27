import java.util.Scanner;
public class Q3_IsValidVoter {
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("please enter your age : ");
     double age=sc.nextDouble();
     String result=(age>=18) ? "you are eligible for vote" : "person is not eleigible for vote";

     System.out.print(result);
  }
}
