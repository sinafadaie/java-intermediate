
public class TaxCalculator2018 extends AbstractTaxCalculator implements TaxCalculator{  //we can removed implements TaxCalculator here
                                                                                        //because AbstractTaxCalculator hase implements TaxCalculator
                                                                                        //and because its a abstract class,java knows TaxCalculator2018 implements TaxCalculator
    private double taxableIncome;

    public TaxCalculator2018 (double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}
