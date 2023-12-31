import java.util.Scanner; // By using Arithmetic operations 
public class ArithmeticOperators_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number Respectively");
        int FirstNum=sc.nextInt();
        System.out.println("Enter the Second Number Respectively");
        int SecondNum=sc.nextInt();
        int add=FirstNum+SecondNum;
         System.out.println("Addition of two Numbers:"+ add);
         
          int sub=FirstNum-SecondNum;
         System.out.println("Subtration of two Numbers:"+ sub);
         
          int mul=FirstNum*SecondNum;
         System.out.println("mutliplication of two Numbers:"+ mul);
         
          float div=FirstNum/SecondNum;
         System.out.println("Division of two Numbers:"+ div);
         
          int Mod=FirstNum%SecondNum;
         System.out.println("Addition of two Numbers:"+ Mod);
    }
}
