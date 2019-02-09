package CasA;

public class Employee {
    Service s;
    private String name;
    private double salary;

    public Employee(String name, double salary, Service s){
        this.name = name;
        this.salary = salary;
        this.s = s;
    }

    public Service getS() {
        return s;
    }

    public void setS(Service s) {
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
