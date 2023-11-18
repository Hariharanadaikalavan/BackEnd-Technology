import java.util.Scanner;
public class StudentMarks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Tamil marks");
        int Tamil=sc.nextInt();
          System.out.println("Enter the English marks");
        int English=sc.nextInt();
          System.out.println("Enter the Maths marks");
        int Maths=sc.nextInt();
          System.out.println("Enter the Science marks");
        int science=sc.nextInt();
          System.out.println("Enter the Social marks");
        int social=sc.nextInt();
        int Total=(Tamil+English+Maths+science+social);
        System.out.println("Total Obtained marks is "+Total);
        double Average=(Tamil+English+Maths+science+social)/5;
        System.out.println("The average marks of student is "+Average);
        if(Average<=100)
        {
            System.out.println("Congras you got A+");
        }
        else if(Average<=80)
        {
            System.out.println("b Grade");
        }
        else if(Average<=70)
        {
            System.out.println("c grade");
        }
    }
    
    
}
