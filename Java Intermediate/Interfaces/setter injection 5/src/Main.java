//construction injection is a more common approach
//but using setter injection, we can change the dependencies
//of class throughout the lifetime of our application

public class Main{
    public static void main(){
        var calculator = new TaxCalculator2018(100_000);
        var calculator2 = new TaxCalculator2017(100_000);

        var report= new TaxReport(calculator);  //we have report based on 2018
        System.out.println(report.show());

        report.setCalculator(calculator2);      //but we decide to convert to 2017(use setter injection)
        System.out.println(report.show());
    }
}