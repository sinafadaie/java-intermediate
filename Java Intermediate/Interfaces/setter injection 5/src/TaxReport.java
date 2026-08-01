
public class TaxReport {
    private TaxCalculator calculator;


    public TaxReport(TaxCalculator calculator){
        this.calculator=calculator;
    }

    public double show(){
        var tax = calculator.calculateTax();
        return tax;
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
