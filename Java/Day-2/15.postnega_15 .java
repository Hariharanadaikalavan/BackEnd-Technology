import java.util.Scanner;
public class postnega_15 {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        byte Number=sc.nextByte();
        int result=((Number>>31)&1);
        String finals=(result==0)?"Postive Number":"Negative Number";
        System.out.println(finals);

    }
    
}
