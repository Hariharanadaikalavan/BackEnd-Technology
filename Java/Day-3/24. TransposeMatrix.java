public class TransposeMatrix_24 {
   public static void main(String [] args){
     int val[][]={{1,2,5},{3,4,7},{1,2,3}};

    System.out.println("normal matrix is: ");
    for(int i=0;i<val.length;i++)
    {
     for(int j=0;j<val[i].length;j++)
     {

       System.out.print(val[i][j]+" ");
       }
       System.out.println();
}
    
    
         System.out.println("Transpose matrix is:");
         
         
    for(int i=0;i<val.length;i++)
    {
     for(int j=0;j<val[i].length;j++)
    {

      System.out.print(val[j][i]+" ");
    }
      System.out.println();
    }
 }
}
