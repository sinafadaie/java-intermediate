//by implements we interduce the interface
//our interface said every class that implements me
//should have a public method with the exact same signature(here is the interface)
//-----------------------------
//in best practice,we should apply override annotation
//over interface method
//because we are implement a method that exists in other file
//and with this annotation,we can see error if the method doesnt exists,otherwise the error doest not show up

public class TaxCalculator2018 implements TaxCalculator{  //we declare the interface for this class
    private double taxableIncome;

    public TaxCalculator2018 (double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }


    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}
