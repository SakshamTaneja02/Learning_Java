class Phone{
    public void name(){
        System.out.println("This is phone");
    }
    public void time(){
        System.out.println("This is time");
    }
}
class SmartPhone extends Phone{
    public void name(){
        System.out.println("This is smartphone");
    }
    public void model(){
        System.out.println("This is smartphone model");
    }
}
class DynamicMethodDispatch{
    public static void main(String args[]){
        Phone a = new SmartPhone(); // we can do this, this helps us implement runtime polymorphism as object is created during runtime
        // SmartPhone b = new Phone(); this is not allowed
        a.name();
        // a.model(); this is not allowed
        a.time();
    }
}