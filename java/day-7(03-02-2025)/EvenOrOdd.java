import java.util.Scanner;

public class EvenOrOdd
{
  public static void main(String args[])
  {
      
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
      if(a<0)
     { System.out.println(a+" is neither even nor odd number , it is negative number");
      return ;
    }
      if(a%2==0)
        System.out.println(a+" is even number");
      else
      System.out.println(a+" is odd number");  


  }
}