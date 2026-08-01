//constructor technicaly is a method
//so it can overloaded

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee
                (50_000,20);
        System.out.println(employee.calculateWage(20));
        System.out.println(employee.calculateWage());

        Employee employee2 = new Employee(50_000);

    }

}

