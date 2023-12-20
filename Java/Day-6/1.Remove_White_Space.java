public class Remove_White_Space {
    public static void main(String args[]){
        
       String str="              hari   haran       ";
       String str2="";
       
       
       System.out.println(str.length());
       for(int i=0;i<str.length();i++) // its prints only condition is statifying the condition is (chart at (index) is empty then its leave 
       {
       
                    if(str.charAt(i)!=' ') 
                    {
                     str2=str2+str.charAt(i);
                    }
       
       }
       System.out.println(str2);
    }
}
