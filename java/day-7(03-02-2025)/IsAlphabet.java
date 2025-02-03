import java.util.Scanner;

public class IsAlphabet
{
  public static void main(String args[])
  {
      
    Scanner sc=new Scanner(System.in);

    char a=sc.next().charAt(0);
      
    if(a>'a'&&a<'z'||a>'A'&&a<'Z')
    {
      System.out.println(a + " is an Albhabet");
    }
    else
    {
      System.out.println(a + " is not Albhabet");
    }

  }
}