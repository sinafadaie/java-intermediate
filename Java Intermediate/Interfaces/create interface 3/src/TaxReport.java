//dependency injection concept:
//we have coupling or dependency here.
//taxreport class depend on TaxCalculator2018,we should remove this
//this handle in oop with **dependency injection** concept
//this concept says our classes should not instantiate their dependencies
//for example our report class is instantiating calculator object
//its not gonna be happen,its should be change
//creating calculate object and use it are tow different concerns,now we create it here for use it
//dependency injection says you just use it here
//we want to get the responsibility of create this object transfer to another class
//and that class give report class a calculate object,so we can use it here directly
//in other word that class pass or inject a dependency(that other class is main)
//its can be done by
//1.construction injection
//2.setter injection
//3.method injection

public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport(){
        calculator = new TaxCalculator2018(100_000);
    }

    public double show(){
        var tax = calculator.calculateTax();
        return tax;
    }
}
