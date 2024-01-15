import java.util.Scanner;  
public class LeastCommonFactor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int num1=sc.nextInt(),num2=sc.nextInt();
        
        
        int str=(num1>num2)?num1:num2;
        System.out.println("Largest Number is:"+str);
        
        while(true)
        {
             if((str%num1==0)&&(str%num2==0))
             {
             System.out.println("LCM="+str);
             break;
             }
         
        str++;
        }
        
        
    }
}
