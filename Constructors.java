class Employee{
    private int id;
    private String name;
    public Employee()
    {
        id = -1;
        name = "Your_Name";
    }
    public Employee(String s)
    {
        id = 45;
        name = s;
    }
    public Employee(String s,int i)
    {
        id = i;
        name = s;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int num){
        id = num;
    }
    public void setName(String s){
        name = s;
    }
}

class Constructors{
    public static void main(String args[]){
        // Employee h = new Employee();
        // Employee h = new Employee("Luffy");
        Employee h = new Employee("Luffy",0);
        System.out.println(h.getName());
        System.out.println(h.getId());
    }
}