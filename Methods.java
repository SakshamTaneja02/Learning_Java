class Methods{
    static int logic(int x,int y){
        int z;
        if(x>y) z = (x * y) * 5;
        else z = x + y;
        return z;
    }
    int log(int x,int y){
        int z;
        if(x>y) z = (x * y) * 5;
        else z = x + y;
        return z;
    }
    public static void main(String args[]){
        int k = logic(10,17);
        Methods f = new Methods(); // method invocation using object creation
        System.out.println(k);
        System.out.println(f.log(17,10));
    }
}