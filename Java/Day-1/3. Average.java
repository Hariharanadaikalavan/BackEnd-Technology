import java.util.Scanner;
public class Average_3 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter you Tamil marks Respectively");
      int Tamil=sc.nextInt();
          System.out.println("Enter you English marks Respectively");
      int English=sc.nextInt();
          System.out.println("Enter you Math marks Respectively");
      int Maths=sc.nextInt();
          System.out.println("Enter you Science marks Respectively");
      int Science=sc.nextInt();
          System.out.println("Enter you Social marks Respectively");
      int Social=sc.nextInt();
      
      float TotalMarks=(Tamil+English+Maths+Science+Social)/5;
     
      System.out.println("The Average of the Five numbers is :"+TotalMarks);
      
    }
}
