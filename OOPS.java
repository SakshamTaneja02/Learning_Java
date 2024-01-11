class Employee{
    int id;
    String name;
    public void props(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class OOPS{
    public static void main(String args[]){
        Employee s = new Employee(); // instantiating a new employee object
        // setting properties
        s.id = 1;
        s.name = "Luffy";
        // System.out.println(s.id);
        // System.out.println(s.name);
        s.props();
    }
}