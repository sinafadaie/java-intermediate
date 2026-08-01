//overloading method is
//create different implitation of it but with different parameters
//for example when a employee havnt extra hours
//we want call method without argument
//--------------------------
//in java we cant set default value to a prameter
//and overloading is the way we handle
//--------------------------
//overloading is not very good
//make our application hard to maintane
//dont over use it

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee
                (50_000,20);
        System.out.println(employee.calculateWage(20));
        System.out.println(employee.calculateWage());

    }

}

