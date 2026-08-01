//we should monitor data for fields
//and because of encapsulization it can not in main method
//so we define setter method
//------------------------------------------
//we probably need to see data in main method
//so we define getter
//------------------------------------------
//we pass the value by argument
//but it is not conflict with encapsulization
//because we use object field finally(we store the value)
//setter and getter is a standard in java oop
public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(20);

        System.out.println(wage);
        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());

    }
}

