import java.util.Scanner;
public class AscendingOrder {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Array Size");
        int ArraySize=sc.nextInt();
        System.out.println("Enter value upto stored");
        int LengthofArray=sc.nextInt();
       
        int array[]=new int[ArraySize];
        for(int m=0;m<LengthofArray;m++)
        {
            array[m]=sc.nextInt();
        }
      

        
        for (int i = 0; i < array.length; i++) 
        {
        for (int j = i + 1; j < array.length; j++)
            {
             if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //System.out.println(array[9]);//This is internal purpose wheather the array is update or note

      System.out.print("Sorted array-->");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+",");
        }
    }
}
