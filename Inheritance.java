// java does not support multiple inheritance

class Base{
    int x;
    Base(){
        System.out.println("I am base constructor");
    }
    Base(int a){
        x = a;
        System.out.println("I am base constructor with a");
    }
    public int getX(){
        return x;
    }
    public void setX(int y){
        x = y;
    }
}

class Derieved extends Base{
    // Derieved(){
    //     System.out.println("I am der constructor");
    // }
    int y;
    Derieved(){
        super(0);
        System.out.println("I am der constructor");
    }
    Derieved(int xx,int yy){
        super(xx);
        y = yy;
        System.out.println("I am der constructor");
    }
    public int getY(){
        return y;
    }
    public void setY(int z){
        y = z;
    }
}

class Inheritance{
    public static void main(String args[]){
        // Base b = new Base();
        // b.setX(4);
        // System.out.println(b.getX());
        // b.setY(4);
        // System.out.println(b.getY()); gives error as we cannot use properties of derieved class from base class
        // Derieved d = new Derieved();
        // d.setX(4);
        // System.out.println(d.getX());
        // d.setY(43);
        // System.out.println(d.getY());
        Derieved d = new Derieved(4,5);
        System.out.println(d.getY()+" "+d.getX());
    }
}