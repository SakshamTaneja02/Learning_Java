class Operators{
    public static void main(String args[]){
        int a = 4;
        // int b = 6 + a;
        // int b = 6 - a;
        // int b = 6 * a;
        // int b = 6/4;
        int b = 6%a;
        b+=3;
        b-=10;
        b++;
        --b;
        b--;
        ++b;
        System.out.println(b);
        System.out.println(6==8);
        System.out.println(64>=6);
        System.out.println(64>6 && 64<100);
        System.out.println(64>6 && 64<10);
        System.out.println(64>6 || 64<10);
        System.out.println(100 & 198);
        System.out.println(100 | 198);
        System.out.println(100 ^ 198);
        System.out.println(4.8%1.1);


        // Associativity and precedence of operators
        System.out.println(6*4-31/4);
        System.out.println(6*31/4);
    }
}