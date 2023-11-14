import java.util.Scanner;
public class Swapping_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first Number Respectively");
        int FirstNumber=sc.nextInt();
        System.out.println("Enter the Second Number Respectively");
        int SecondNumber=sc.nextInt();
        System.out.println("Before Swapping FirstNumber is = "+FirstNumber);
        System.out.println("Before Swapping Second Number is = "+SecondNumber);
        
        FirstNumber=FirstNumber+SecondNumber;
        SecondNumber=FirstNumber-SecondNumber;
        FirstNumber=FirstNumber-SecondNumber;
        
        System.out.println("After Swapping First Number is = "+FirstNumber);
        System.out.println("After Swapping Second Number is = "+SecondNumber);
    }
}
