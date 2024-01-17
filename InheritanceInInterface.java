interface sample{
    void meth1();
    void meth2();
}
// we can extend an interface to another interface but not to a class
interface childSample extends sample {
    void meth3();
}
class Base implements childSample{
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}
class InheritanceInInterface{
    public static void main(String args[]){

    }
}