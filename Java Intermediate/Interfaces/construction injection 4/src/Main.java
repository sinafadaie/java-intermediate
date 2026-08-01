//you have a interface of tax calculate
//and your report is base on it
//but your calculation rule maybe change(2018,2017,...)
//but your interface is stable
//for example you create 2018 object in main
//pass it to yor reporter(for reporter it doesnt matter 2017 or 2018)
//------------------------------
//when you want to connect to classes,you should think about interface
//when you have interface, you should think about dependency injection
//all the instance you create on memory should be in the main and then injected
//------------------------------
//in large apllication, create many object in main method
//and inject them to other class is so hard
//so frame work like spring developed to do this for us


public class Main{
    public static void main(){
        var calculator = new TaxCalculator2018(100_000);
        var calculator2 = new TaxCalculator2017(100_000);

        var report1 = new TaxReport(calculator);   //inject the calculator object in to taxreport constructor
        var report2 = new TaxReport(calculator2);  //inject the calculator2 object in to taxreport constructor
        System.out.println(report1.show());
        System.out.println(report2.show());
    }
}