import java.util.Scanner;


class CharToAscii
{

  

  public static void main(String args[])
   {

      Scanner sc = new Scanner(System.in);
       
       char ch=sc.next().charAt(0);
       
    System.out.print((int)ch);
    }
}