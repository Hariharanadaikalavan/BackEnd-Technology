import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter value");
        int original=sc.nextInt();
        int a=original,sum=0,Remainder;
        while(a!=0)
        {
        Remainder=a%10;
        System.out.println("Remainder of"+(a)+" = "+Remainder);
         sum+=Remainder*Remainder*Remainder;
         System.out.println("Sum of"+(a)+" = "+sum);
         a/=10;
         System.out.println("Quiotent of"+(a)+" = "+a);
        }
        String result=(sum==original)?"Armstrong":"Not a Armstrong";
        System.out.println((sum)+"= "+(original)+result);
    }
    }
