//its a tightly class
public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2018(100_000);
    }

    public double show(){
        var tax = calculator.calculateTax();
        return tax;
    }
}
