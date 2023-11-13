import java.util.Scanner;
class ScannerExample{
public static void main(String args[]){

Scanner sc =new Scanner(System.in);
char ch=1;
do{
System.out.println("Enter your name:");
String name=sc.nextLine();
System.out.println("Your name is:"+name);
System.out.println("number please");
long number=sc.nextFloat();
System.out.println(
System.out.println("Do you want to continue Y or N");
ch=sc.next().charAt(0);
}
while(ch == 'y'||'Y');

}
}
