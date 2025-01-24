import java.util.Scanner;


class Add32
{

  

  public static void main(String args[])
   {

      Scanner sc = new Scanner(System.in);
       
       char ch=sc.next().charAt(0);
       
       int n=32+(int)ch;

    System.out.print((char)n);
    }

  
}