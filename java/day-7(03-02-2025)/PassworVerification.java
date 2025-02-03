import java.util.Scanner;


public class PassworVerification {
  
  public static void main(String arg[])
  {
     Scanner sc = new Scanner(System.in);

      String id="vikasmaddheshiya@gmail.com";
      String password="Vv@12345";

      System.out.println("enter your id ");
      String userId= sc.nextLine();
      System.out.println("enter your password ");
      String userPassword= sc.nextLine();
       if(userId.equals(id) && userPassword.equals(password))
         {
          System.out.println("succesfully login");

         }
         else
         {
          System.out.println("Error : userId or password is incorrect ");
         }
  }

}
