class Employee{
    int id;
    String name;
    private int salary;
    public void setSalary(int x){
        salary = x;
    }
    public int getSalary(){
        return salary;
    }
}
class AccessModifiers{
    public static void main(String args[]){
        Employee s = new Employee();
        s.id = 45;
        s.name = "S";
        // s.salary = 450; gives error as we access private properties
        s.setSalary(450);
        System.out.println(s.getSalary()); // we can access private properies using getters and setters
    }
}