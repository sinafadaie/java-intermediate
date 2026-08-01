public class TaxCalculator2017 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2017 (double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    @Override
    public double calculateTax(){
        return taxableIncome * 0.2;
    }
}
