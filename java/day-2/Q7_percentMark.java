import java.util.Scanner;



class Q7_percentMark
{


  public static void main(String args[])
   {
   
      Scanner sc=new Scanner(System.in);
      System.out.print("\nEnter the mark : " );
      int getMark=sc.nextInt();
      
       System.out.print("\nEnter the total mark : " );

      int totalMark=sc.nextInt();

     // double percentMark=(getMark/totalMark)*100;

      double percentMark=getMark/totalMark;
       
       percentMark=percentMark*100;
     System.out.print("Percentage of mark : " + percentMark);

    }

  
}