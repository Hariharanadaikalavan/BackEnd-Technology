import java.util.Scanner;
public class GetterSetter {
    private double withdraw;
    private double deposite;
    
    public double getWithdraw(){
        return withdraw;       
    }
    public void setWithdraw(double withdraw){
        this.withdraw=withdraw;                              //this key word used when parameter and variable are same name In order to avoid the complier confusion this key words is used 
    }
    
     
   public double getDeposite(){
        return deposite;
    }
   public void setDeposite(double deposite){
        this.deposite=deposite;
    }
    
    void display(){
        System.out.println(deposite);
        System.out.println(withdraw);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        GetterSetter obj=new GetterSetter();
        double desposite=sc.nextDouble();
        obj.setDeposite(desposite);
        double withdrw=sc.nextDouble();
        obj.setWithdraw(withdrw);
        obj.display();
       
    }
}
