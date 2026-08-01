public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

   /*
   public Employee(int baseSalary){
        setBaseSalary(baseSalary);
        setHourlyRate(0);
    }*/

   public Employee(int baseSalary){     //instead of above syntax
       this(baseSalary,0);    //it is more profetional(reuse pre code instead of write new)
                                        //this refer to current object
                                        //(this.) we can use method or field
                                        //just (this) mean the full object
                                        //so we can construct the object with this
                                        //actually we use **pre constructor** in new constructor
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


