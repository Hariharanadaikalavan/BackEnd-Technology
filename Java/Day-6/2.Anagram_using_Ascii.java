public class Anagram {                                     
    public static void main(String args[]){
         String str1="hariharan";
       String str2="harharian";
       int sum=0,sums=0;
       
       
        for(int i=0;i<str1.length();i++)
        {
                    int a=(str1.charAt(i)-96);            //By using the addition of ASCII Values
                    sum=sum+a;
        }
        System.out.println(sum);
     
        
        for(int i=0;i<str1.length();i++)
        {
                        int b=(str2.charAt(i)-96);
                        sums=sums+b;
        }
        System.out.println(sums);
        
        String result=(sum==sums)?"Anagram":"Not a anagram";
        System.out.println(result);

    }
    
}
