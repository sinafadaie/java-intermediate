public abstract class AbstractTaxCalculator implements TaxCalculator{
    protected static double getTaxabaleIncome(double income,     //use protected access modifire
                                              double expense) {  //to hide this method from the outside
        return income - expense;                                 //but be able to use it in classes that inherit from this abstract
    }
}
