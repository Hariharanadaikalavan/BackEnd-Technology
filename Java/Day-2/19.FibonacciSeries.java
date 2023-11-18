import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range fibonacci series upto");
        int FirstNum=0,SecondNum=1,serieupto=sc.nextInt(),sum=0;
    for(int i=0;i<=serieupto;i++){
        System.out.print(FirstNum+",");
     int result=FirstNum+SecondNum;
     FirstNum=SecondNum;
     SecondNum=result;
     sum+=FirstNum;
   
     
    }
   System.out.println("sum "+sum);
    }

    }
