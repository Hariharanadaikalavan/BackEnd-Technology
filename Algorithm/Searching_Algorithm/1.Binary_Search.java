class Dummy {
      
     public static void binarySearch(int array[],int left,int right,int key){
         
         while(left<=right)
         {
             int middle = left + (right - left) / 2;
                    if(array[middle]<key){
                        left=middle+1;
                    }else if(array[middle]==key){
                        System.out.println("element found @ :"+middle+"th index");
                        break;
                    }else if(array[middle]>key){
                        right=middle-1;
                    }
          }
         if(left>right){
             System.out.println("Element not found");
         }
 }
 public static void main(String args[]) {
       int array[]={1,2,3,4,5,6,7,8,9,10};
       int left=0;
       int right=array.length-1;
      
       int key=9;
       
       binarySearch(array,left,right,key);
    }
}

