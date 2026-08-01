public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0) {
            throw new IllegalArgumentException("Salary can not be zero or less");
        }
        this.baseSalary=baseSalary;         //this return to current object
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate<=0){
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


