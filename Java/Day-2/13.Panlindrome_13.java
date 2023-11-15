import java.util.Scanner;
public class Panlindrome_13 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to be reverse");
        int original=sc.nextInt();
        int Number=original;int reverse=0;
      while(Number!=0)
        {
        int remainder=Number%10;
        reverse=reverse*10+remainder;
        Number=Number/10;
        System.out.println("reverse number in loop is :"+reverse);
//        System.out.println("or"+Number);
        }
      String output=(original==reverse)?"Palindrome":"Not Palindrome";
      System.out.println((original)+"="+(reverse)+" "+output);

    }
}
