import java.util.Scanner;
public class HigherCommonFactor {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        
        
        int str=(num1<num2)?num1:num2;
        //System.out.println("Largest Number is:"+str);
        
        while(str>2){
        if((num1%str==0)&&(num2%str==0))
        {
            System.out.println("hcf="+str);
            break;
            
        }
        str--;
        }
        
        
    }
}
