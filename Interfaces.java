//Abtract class can have both abstract methods and non-abstract method but interface can only have method without any body
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Tyre{
    void burst();
}

// if we implement a interface then we have to implement all the method in that interface
// we can also implement multiple interface for a single class 
// java does not multiple inheritance as it faces problem if we method with same signature so we prefer using interface for that purpose
class Avon implements Bicycle,Tyre{
    int speed = 10;
    // all method inherited from interface have to be public
    public void applyBrake(int decrement)
    {
        if(speed-decrement<0) return ;
        speed = speed - decrement;
    }
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }
    public void blowHorn(){
        System.out.println("Move ** get out of the way");
    }
    public void burst(){
        System.out.println("Tyre goes boooom");
    }
}

class Interfaces{
    public static void main(String args[]){
        Avon cycle = new Avon();
        System.out.println(cycle.a);
        // we can use the values in an interface but we cannot change them
        // cycle.a = cycle.a - 1; gives error 
        cycle.burst();
    }
}