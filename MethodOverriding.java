class A{
    public int f(){
        return -1;
    }
    public void a(){
        System.out.println("This is a");
    }
}
class B extends A{
    public void b(){
        System.out.println("This is b");
    }
    // method overriding
    @Override // this is just a notation of saying that this method is overriding, we may or may not use it, 
    //it helps us if we make changes in base class but forgot do make change in derieved class
    public void a(){
        System.out.println("This is a of B");
    }
}
class MethodOverriding{
    public static void main(String args[]){
        B b = new B();
        b.a();
    }
}