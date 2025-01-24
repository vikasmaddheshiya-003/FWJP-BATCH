import java.util.Scanner;


class AreaOfCircle
{
  public static void main(String []args)

  {
  
  Scanner sc=new Scanner(System.in);
  

    float pi=3.14f;
    float rad=sc.nextFloat();
    float area=pi*rad*rad;
    System.out.print("area of cirlce : "+ area);
  }
}