//in oop cllassess have tow type of members
//1.instance members (member of instance(obj))
//2.static members   (member of class)
//instance member is clear
//static member is a member shared across instances (not just for a particular instance)

public class Main {
    public static void main(String[] args) {

        System.out.println(Employee.numberOfEmployees); //numberOfEmployees connect directly to class, not connect to object(its a static field)
        Employee employee2 = new Employee(50_000);
        System.out.println(Employee.numberOfEmployees);

        Employee.printNumberOfEmployees();          //static method

    }

}

