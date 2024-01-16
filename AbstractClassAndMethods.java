abstract class Base{
    Base(){
        System.out.println("This is the constructor for base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Derieved extends Base{
    Derieved(){
        System.out.println("This is the constructor for derieved");
    }
    public void greet(){
        System.out.println("Howdy Mate");
    }
    public void greet2(){
        System.out.println("Howdy Mate");
    }
}
// abstract class Derieved extends Base{
//     Derieved(){
//         System.out.println("This is the constructor for derieved");
//     }
// }
// class Derieved extends Base{
    // to do this we either declare Derieved as abstract or extend all abstract methods in base, if we dont we will get error
// }
class AbstractClassAndMethods{
    public static void main(String args[]){
        // Base b = new Base(); gives error 
        Derieved dev = new Derieved(); // can be done
        dev.greet();
    }
}