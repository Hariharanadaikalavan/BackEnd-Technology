public class OverLoad_34 {
    
    String name;
    int age;
    OverLoad_34()
    {
        System.out.println("Hello");
    }
    
    OverLoad_34(String i){
        
        name=i;
        
    }
    
    OverLoad_34(String i,int a){
        
        name=i;
        age=a;
        
    }
    void display(){
        System.out.println("hello"+name+age);
    }
    
    
    
    public static void main(String args[]){
        OverLoad_34 obj=new OverLoad_34();
        OverLoad_34 obj1=new OverLoad_34("Hariharan");
        OverLoad_34 obj2=new OverLoad_34("Hariharan",23);
        
        obj1.display();
         obj2.display();
    }
}

