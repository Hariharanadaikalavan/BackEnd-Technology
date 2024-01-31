class A {  
     public static void firstmethod(){
         System.out.print("first method invoked");
     }
     A(){
         System.out.println("Dummy one Default Constructor");
     }
 }

class B extends A{
   
    public void secondMethod(){
        System.out.println("Second method invoked");
    }
     B(){
        System.out.println("Dummy two Default COnstuctor");
   }
}
    
 class C extends B{
     
     public void thridMethod(){
         System.out.println("Third methods invoked");
     }
     C(){
         System.out.println("Dummy3 Default constructor");
     }
 }
 
 class D extends C{
     
     public void Fourmethod(){
         System.out.println("Fourth method invoked");
     }
     D(){
         System.out.println("Duum4 default constructor");
     }
     
 }
    
public class Multilevelinheritance {
    
    public static void main(String args[]){
        D obj=new D();
        obj.Fourmethod();
        
       
    }
}

//Output:-  
// Dummy one Default Constructor
// Dummy two Default COnstuctor
// Dummy3 Default constructor
// Duum4 default constructor
// Fourth method invoked
// BUILD SUCCESSFUL (total time: 0 seconds)

