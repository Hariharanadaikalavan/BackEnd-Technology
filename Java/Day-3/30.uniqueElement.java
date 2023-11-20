import java.util.Scanner;
public class KeySearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ArraySize=sc.nextInt();
         System.out.println("Enter the array elements");
       int LengthofArray=sc.nextInt();
       
        int array[]=new int[ArraySize];
        for(int m=0;m<LengthofArray;m++)
        {
            array[m]=sc.nextInt();
        }
        
        System.out.println("Enter the Key element to search");
        int key=sc.nextInt();
        for(int j=0;j<array.length;j++){
        for(int i=j+1;i<array.length;i++){
            
            if(array[i]==key)
            {
                System.out.println("present");
                
            }
            break;
            
        }
        }
    
    }
    
