import java.util.Scanner;

class TakingInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int a = sc.nextInt();
        System.out.println("Enter number two: ");
        int b = sc.nextInt();
        System.out.println(a+b);
        float c = sc.nextFloat();
        boolean b = sc.hasNextInt();
        System.out.println(b);
        String str = sc.next();
        System.out.println(str);
        String str = sc.nextLine();
        System.out.println(str);
    }
}