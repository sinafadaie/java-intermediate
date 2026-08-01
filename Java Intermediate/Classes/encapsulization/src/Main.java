//bundle the data and methods that
//operate on the data in a single unit


//we said in oop we stored data in object
//we stored baseSAlary an hourlyRate in object
//and because extraHours change rapidly we decide it is not field
//and pass it like a argument
//so we reduce argument like said in oop

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary=50_000;
        employee.hourlyRate=20;
        int wage = employee.calculateWage(20);

        System.out.println(wage);

    }


}
