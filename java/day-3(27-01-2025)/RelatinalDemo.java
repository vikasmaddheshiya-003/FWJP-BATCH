
import java.util.Scanner;
class relatinalDemo
{

  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();

   System.out.println(" a is greater than b :"+ (a>b)); 
      System.out.println(" a is greater than or eqal to  b :" +(a>=b));   
       System.out.println(" a is less than b :" +(a<b));   
       System.out.println(" a is less than or eqal to b :"+ (a<=b));   
        System.out.println(" a is eqal to b :" +(a==b));   
         System.out.println(" a is not eqal  to b :" +(a!=b));   
  
}
}