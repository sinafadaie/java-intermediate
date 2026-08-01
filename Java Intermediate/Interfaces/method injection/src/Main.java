//inject tax calculator object directly to show method
//so we removed it from construction and setter, and we dont need field

public class Main{
    public static void main(){
        var calculator = new TaxCalculator2018(100_000);

        var report= new TaxReport();
        System.out.println(report.show(calculator));

        System.out.println(report.show(new TaxCalculator2017(200_000)));    //we can create or object every where!

    }
}