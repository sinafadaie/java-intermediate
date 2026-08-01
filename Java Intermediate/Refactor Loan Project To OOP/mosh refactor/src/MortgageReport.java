//create a class for ui,not calculate anything
//we create a field(calculator) for our class (just not a variable)
//this field hase type of  mortgage calculator object
//----------
//we dont use static field and method too much (unless its meaningful so much)
//they create trouble

public class MortgageReport {

    private MortgageCalculator calculater;  //we create field to get mortgage calculater object from outside

    public MortgageReport(MortgageCalculator calculater) {
        this.calculater = calculater;
    }

    public void printMortgage(){
        double mortgage=calculater.calculateMortgage();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment:" + mortgage);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance :calculater.getlistOfPayment()){
            System.out.println(balance);
        }
    }
}
