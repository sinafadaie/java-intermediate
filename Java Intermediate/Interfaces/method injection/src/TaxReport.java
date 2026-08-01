
public class TaxReport {

    public double show(TaxCalculator  calculator){
        var tax = calculator.calculateTax();
        return tax;
    }

}
