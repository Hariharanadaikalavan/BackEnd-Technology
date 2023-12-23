public class VowelsConstant {
    public static void main(String args[]){
        
        int vowels=0;
        String Sentences="Hi My Name is Hariharan";
       
          for(int i=0;i<Sentences.length();i++){
             char Characters=Sentences.charAt(i);
             
             if(Characters=='a'|| Characters=='e'|| Characters=='i' || Characters=='o' || Characters=='u' || Characters=='A'||Characters=='E'||Characters=='I'||Characters=='O'||Characters=='U');
             {
                 ++vowels;  //Counter
             }
             System.out.println(i);
        }
    }
}
