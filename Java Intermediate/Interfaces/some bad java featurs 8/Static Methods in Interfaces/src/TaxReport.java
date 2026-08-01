
public class TaxReport {
    private TaxCalculator calculator;   //we cant create instance of interface class
                                        //but we can create field or variable base on it (its says what come from the interface ,looks like with what?)

    public TaxReport(TaxCalculator calculator){     //this is constructor injection
        this.calculator=calculator;
    }

    public double show(){
        var tax = calculator.calculateTax();
        return tax;
    }
}
