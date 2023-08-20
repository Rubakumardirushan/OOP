class vehical{
public void drive(){
    System.out.println("run fast");
}
}

class bike extends vehical{
    
  public void drive(){
    super.drive();
    System.out.println("run fast  bike");
}  
public void callanimalclass(){
    super.drive();
}

}


public class single2inheritance {
    public static void main(String args[]){
bike b1=new bike();
b1.callanimalclass();

    }
}
