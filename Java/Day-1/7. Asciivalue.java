import java.util.Scanner;
public class Asciivalue_7 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the english alphabetic for know the equal ASCII Values  Starting Respectively");
         
       // char character=sc.next().charAt(0);
       //int AsciiValue=character;
     
       char Start=sc.next().charAt(0);
         System.out.println("Please Enter the english alphabetic for know the equal ASCII Values  Ending Respectively");
       char upto=sc.next().charAt(0);
       
       for(int i=Start;i<=upto;i++){
       System.out.println("Ascii Values "+(char)i+ " : "+i);
        
    }
}
}
