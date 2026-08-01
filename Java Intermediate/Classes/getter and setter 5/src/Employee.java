//this return to current object
//intellij can create getter and setter method itself
public class Employee {
    private int baseSalary;     //make it private
    private int hourlyRate;


    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0) {
            throw new IllegalArgumentException("Salary can not be zero or less");
        }
        this.baseSalary=baseSalary;         //this return to current object
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate<=0){
            throw new IllegalArgumentException("hourly rate can not be negetive");
        }
        this.hourlyRate=hourlyRate;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
    public int calculateWage (int extraHours){
        return baseSalary+(hourlyRate*extraHours);
    }


}
