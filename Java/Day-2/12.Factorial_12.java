import java.util.Scanner;

public class Factorial_12 {
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int Factorial=1;
           for(int i=1;i<=n;i++)
           {
           Factorial*=i;
           System.out.println((char)i+" "+Factorial);
           }
           System.out.println(Factorial);
       }
}
