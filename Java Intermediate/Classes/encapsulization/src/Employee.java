//the method is not static
//when we want use a method in main method we define it static
//talk about it lATER

public class Employee {
    public int baseSalary;
    public int hourlyRate;


    public int calculateWage (int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }
}
