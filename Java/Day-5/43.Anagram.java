import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the first String");
  String str1=sc.next();
  System.out.print("Enter the Second String");
  String str2=sc.next();
   if(str1.length()!=str2.length()){
      System.out.println("Not a Anagram Because the two string are equals length");
       
   }else
   {
      
      char string1[]=str1.toCharArray();
      char string2[]=str2.toCharArray();
             
      
      Arrays.sort(string1);
      Arrays.sort(string2);
      
      System.out.println(string2);
      System.out.println(string1);
      if(Arrays.equals(string1, string2)==true){
          System.out.println("Anagram");
          
      }else{
          System.out.println("Not a anagram");
        
      }
     
  }
  
    }
 }
