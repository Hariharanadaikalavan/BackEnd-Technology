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
    
 class C extends A{
     
     public void thridMethod(){
         System.out.println("Third methods invoked");
     }
     C(){
         System.out.println("Dummy3 Default constructor");
     }
 }
 
 class D extends A{
     
     public void Fourmethod(){
         System.out.println("Fourth method invoked");
     }
     D(){
         System.out.println("Duum4 default constructor");
     }
     
 }
    
public class HierrcharyInheritance {
    
    public static void main(String args[]){
        D obj=new D();
        obj.Fourmethod();
        
        C obj1=new C();
        obj1.thridMethod();
    }
}

// Output:-
//   Dummy one Default Constructor
// Duum4 default constructor
// Fourth method invoked

// Dummy one Default Constructor
// Dummy3 Default constructor
// Third methods invoked
