import java.util.Scanner;
public class OddSums {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=2*number;i+=2)
        if((i&2)!=0) //Bitwise operater
        {
             sum+=i;
             System.out.println(sum);
        }
       System.out.println(sum);
       
    }
}
