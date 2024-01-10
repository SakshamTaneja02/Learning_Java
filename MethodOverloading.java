class MethodOverloading{
    // static void tellJoke(){
    //     System.out.println("How you doing");
    // }
    // static void changeInteger(int x){
    //     x = 4;
    // }
    // static void changeArr(int []x){
    //     x[0] = 0;
    // }
    // this is method overloading
    // static void change(int x){
    //     x = 4;
    // }
    // static void change(int []x){
    //     x[0] = 0;
    // }
    // public static void main(String args[]){
    //     // tellJoke();
    //     int []marks = {100,90,80,70,60};
    //     int x = 45;
    //     change(x);
    //     System.out.println("The value of x after change is: "+ x); // x is not passed by reference so its value is not changed
    //     change(marks);
    //     System.out.println("The value of marks[0] after change is: "+ marks[0]); // arr is passed by reference so its value is changes
    // }

    // another example of method overloading
    static void foo(){
        System.out.println("Foo");
    }
    static void foo(int a){
        System.out.println("Foo"+a);
    }
    static void foo(int a,float b){
        System.out.println("Foo"+a+b);
    }
    static void foo(float a){
        System.out.println("Foo"+a);
    }
    // this is not possible as we can only change the parameters but not return type
    // static int foo(int a,float b){
    //     return a+b;
    // }
    public static void main(String args[]){
        foo();
        foo(1);
        foo(1,10);
        foo(1f);
    }
}