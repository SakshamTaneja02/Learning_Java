class VarArgs{
    // this is tiring and should not be done so instead we will use varargs
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    static int sum(int ...arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sum(10,19,20,32,21,23,45));
    }
}