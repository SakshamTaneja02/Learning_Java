import java.util.Scanner;
class Strings{
    public static void main(String args[]){
        String name = new String("Luffy");
        String name = "Luffy";
        System.out.print("The name is: "); // no new line is added
        System.out.println(name);
        strings are immutable and cannot be changed
        int a = 5;
        float b = 4.465f;
        System.out.printf("The value of a is %d and value of b is %f",a,b); // format specifier format for printing
        System.out.format("The value of a is %d and value of b is %f",a,b); // format specifier format for printing
        System.out.printf("The value of a is %d and value of b is %.2f \n",a,b);
        System.out.printf("The value of a is %d and value of b is %100.2f \n",a,b);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s = sc.nextLine();
        System.out.println(s);
    }
}