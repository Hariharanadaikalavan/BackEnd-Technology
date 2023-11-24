abstract class Animal {
    abstract void speak();
    abstract void eat();
    abstract void walk();
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof");
    }

    @Override
    void eat() {
        System.out.println("Num Num");
    }
    
    void walk(){
        
        
    }
}

public class Abstract_37 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();  
        obj.eat();   
    }
}   
