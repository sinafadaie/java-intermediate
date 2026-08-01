public class Main{
    public static void main(){
        var calculator = new TaxCalculator2018(100_000);
        var calculator2 = new TaxCalculator2017(100_000);

        //System.out.println(TaxCalculator.getTaxabaleIncome(2000,1000));  **removed from interface
    }
}