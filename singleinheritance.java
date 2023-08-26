class animal{
    String name;
    public void animalclass(){
System.out.println(" i am  animal class");
    }
}
class cat extends animal{
    String name;
    public void catclass(){
System.out.println(" i am  cat class");
    }
    public void namechanage( cat c1){
c1.name="newname";
    }
    public void namechanage( animal a1){
a1.name="newname";
    }


}



public class singleinheritance{
public static void main(String args[]){
 
  animal a1= new animal();// a1 object only access animalclass method;
  cat c1= new cat(); // c1 object can access animalsclass method and catclass method;
  a1.animalclass();
  c1.animalclass();
  c1.catclass();
a1.name="a1name";
c1.name="c1name";
// but i can create  cat object  for animal class reference 
animal a2=new cat();
a2.animalclass();
a2.name="a2name";
System.out.println(a1.name);
System.out.println(a2.name);
System.out.println(c1.name);
// but a2 object only access animal class methods
 /* task a1,a2 have variable name is name same time cat class have variable name is name how to change animals class variable name value use cat class object */
  
 c1.namechanage(a2);
 c1.namechanage(c1);
 c1.namechanage(a1);
System.out.println(a1.name);
System.out.println(a2.name);
System.out.println(c1.name);
 
}
} 
