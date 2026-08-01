//in mosh way we should get variable from client in main(we should some interface of it in main )
//in oop when we want to pass the parameters in to different  classes
//we should pass them with entire object, this is encapsulization
//and reduce number of argument in this way

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal=(int) Reader.readNumber("Principal ($1K - $1M): ",1000,1000000);
        float annualInterest = (float) Reader.readNumber("Annual Interest Rate: ",0,30);
        byte years = (byte) Reader.readNumber("Period (years): ",1,30);

        var calculator = new MortgageCalculator(principal,annualInterest,years);
        var report = new MortgageReport(calculator);   //this is so important
                                                       //in oop when we want to pass the parameters in to different  classes
                                                       //we should pass them with entire object, this is encapsulization
                                                       //and reduce number of argument in this way instead passing (principal,annualInterest,years)
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
