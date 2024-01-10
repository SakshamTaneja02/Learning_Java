class Recursion{
    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        System.out.println(fact(5));
        System.out.println(fact(10));
    }
}