import java.util.Scanner;

public class LowerOrUpper
{

 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    char c=sc.next().charAt(0);

    if(c>='a'&&c<='z')
       System.out.println(c + " is in lower case ");
    else

       {
        if(c>='A'&&c<='Z')
        System.out.println(c + " is in upper case ");

        else
        System.out.println(c + " is not alphabet ");

      }
  }
}