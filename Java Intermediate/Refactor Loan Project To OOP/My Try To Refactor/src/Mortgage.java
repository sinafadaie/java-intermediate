//we removed many argument of old method
//this is oop, its because we incapsulate data in an object and reused it!



import java.util.Scanner;

public class Mortgage {
    public int principal;
    private float annualInterest;
    private byte period;
    private static final int percent =100;
    private static final int monthInYear =12;
    private float monthlyRate;


    public Mortgage(){
        setPrincipal();
        setRate();
        setPeriod();
        monthlyRate=(annualInterest/percent)/monthInYear;
    }

    private void setPeriod() {

        period=(byte)Reader.readNumber("Period (years): ",1,30);
    }
    private void setRate() {

        annualInterest=(float)Reader.readNumber("Annual Interest Rate: ",0,30);
    }
    private void setPrincipal() {

        principal=(int)Reader.readNumber("Principal ($1K - $1M): ",1000,1000000);
    }


    private  double calculateMortgage(){

        int numberOfMonth=period*monthInYear;
        double mortgage=(principal*monthlyRate*Math.pow(1+monthlyRate,numberOfMonth)) /
                (Math.pow(1+monthlyRate,numberOfMonth)-1);
        return mortgage;
    }

    private  double calculateRemainMortgage(int numberOfPayment){
        double remainValue=principal
                * (Math.pow(1+monthlyRate,period*monthInYear)-Math.pow(1+monthlyRate,numberOfPayment))
                /(Math.pow(1+monthlyRate,period*monthInYear)-1);

        return remainValue;
    }

    private  void listOfPayment() {
        for (int month = 1; month<= period *monthInYear; month++){
            System.out.println(calculateRemainMortgage(month));
        }
    }

    public void repotMortgage(){
        double mortgage=calculateMortgage();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment:" + mortgage);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        listOfPayment();
    }

}
