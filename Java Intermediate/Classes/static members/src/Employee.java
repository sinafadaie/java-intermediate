//we cant call a instance method in static method
//it is not meaningfull (because you are not in a object level to use object method)
//when we create method in main class
//we declare all of them static
//because main method was static, and it cant be accessable otherwise
//----------------------------
//java declare main method static
//because it enable java runtime to
//directly call this method without create new object

public class Employee {
    private int baseSalary; //this is instance field(belong to each instance)
    private int hourlyRate; //this is instance field(belong to each instance)

    public static  int numberOfEmployees;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
        //calculateWage(50_000,20);          //you cant call instance level method in class level method(static)
    }

    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0) {
            throw new IllegalArgumentException("Salary can not be zero or less");
        }
        this.baseSalary=baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate<0){
            throw new IllegalArgumentException("hourly rate can not be negetive");
        }
        this.hourlyRate=hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }

    public int calculateWage (int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }

    public int calculateWage (){
        return baseSalary;
    }

}


