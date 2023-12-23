import java.util.Scanner;
public class Calucator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Value:");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch(ch)
                {
            case '+': // "String " || 20
            {
                    int c=a+b;
                    System.out.print("Addition of two numbers "+(a)+" + "+(b)+" = "+c);
                    break;
            }
            case '-':
            {
                int c=a-b;
                System.out.print("Subration of two numbers "+(a)+"-"+(b)+"="+c);
                break;
            }
            case '*':
            {
                long c=a*b;
                System.out.print("Multiplication of two numbers "+(a)+"*"+(b)+"="+c);
                break;
            }
             case '/':
        {
              double c=a/b;
             System.out.print("Subration of two numbers "+(a)+"/"+(b)+"="+c);
             break;
        }
             case '%':
             {
                 float c=a%b;
                 System.out.println("Subration of two numbers "+(a)+"%"+(b)+"="+c);
                 break;
             }
             default:
             {
                 System.out.println("Please enter the vaild operator");
             }
    }
    }
    
}
