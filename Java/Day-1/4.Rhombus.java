import java.util.Scanner;
public class Rhombus_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Diagonal1 data Respectively");
        int Diagonal1=sc.nextInt();
        System.out.println("Enter you Diagonal2 data Respectively");
        int Diagonal2=sc.nextInt();
        int AreaofRhombus=(Diagonal1+Diagonal2)/2;
           System.out.println("The area of Rhombus:"+AreaofRhombus);
    }
}
