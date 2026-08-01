public class TaxCalculator2017 extends AbstractTaxCalculator implements TaxCalculator{  //we can removed implements TaxCalculator here
                                                                                        //because AbstractTaxCalculator hase implements TaxCalculator
                                                                                        //and because its a abstract class,java knows TaxCalculator2017 implements TaxCalculator
    private double taxableIncome;

    public TaxCalculator2017 (double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    @Override
    public double calculateTax(){
        return taxableIncome * 0.2;
    }
}
