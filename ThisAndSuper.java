class Employee{
    int a;
    Employee(int a){
        this.a = a;
    }
}
class Derieved extends Employee{
    int y;
    Derieved(int x,int y){
        super(x);
        this.y = y;
    }
}
class ThisAndSuper{
    public static void main(String args[]){
        Derieved d = new Derieved(3,4);
    }
}