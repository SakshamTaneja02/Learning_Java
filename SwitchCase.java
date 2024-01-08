class SwitchCase{
    public static void main(String args[]){
        int age = 18;
        switch(age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to work");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy yourself");
        }
        // Enhanced switch
        switch(age){
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("You are going to work");
            case 60 -> System.out.println("You are going to retire");
            default -> System.out.println("Enjoy yourself");
        }
    }
}