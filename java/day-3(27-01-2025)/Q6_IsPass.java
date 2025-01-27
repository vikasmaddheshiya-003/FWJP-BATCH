import java.util.Scanner;


public class Q6_IsPass {
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);

    System.out.print("enter your marks : ");
    
     double mark=sc.nextDouble();

     System.out.print("enter passing marks : ");
    
     double markPass=sc.nextDouble();
    String result= (mark>=markPass) ? "pass" : "fail";

    System.out.print(" student is "+result);
    
  }
}

