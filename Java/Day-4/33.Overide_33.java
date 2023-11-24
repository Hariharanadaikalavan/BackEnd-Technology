class Candy {
    public void taste() {
        System.out.println("tastes sweet!");
    }
}
class Chocolate extends Candy {
        @Override
        public void taste() {
       super.taste();       
        System.out.println("tastes chocolately");
    }
}

public class Overide_33 {
    public static void main(String[] args) {
      new Overide_33(); 


        Chocolate chocolate = new Chocolate();
        chocolate.taste();
        
       
    }
     Overide_33(){
        System.out.println("Default constructor");
    }
}
