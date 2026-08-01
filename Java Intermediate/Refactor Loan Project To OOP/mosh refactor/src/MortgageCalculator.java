//we removed many argument of old method
//this is oop, its because we encapsulate data in an object and reused it!
//--------------------------
//top menu--->code---->generate(we can get constructor,setter,getter templates)
//--------------------------
//instead of calculate monthlyRate in constructor
//its better to bring it in seperate method
//this is because if we change annualInterst, monthlyInterest change automaticaly
//but if it is seperate field ,we should update it to


public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;
    private static final int percent =100;
    private static final int monthInYear =12;


    public MortgageCalculator(int principal,float annualInterest,byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public  double calculateMortgage(){
        double mortgage=(principal*getMonthlyRate()*Math.pow(1+getMonthlyRate(),getNumberOfMonth())) /
                (Math.pow(1+getMonthlyRate(),getNumberOfMonth())-1);
        return mortgage;
    }

    private  double calculateRemainMortgage(int numberOfPayment){
        double remainValue=principal
                * (Math.pow(1+getMonthlyRate() , getNumberOfMonth())-Math.pow(1+getMonthlyRate() ,numberOfPayment))
                /(Math.pow(1+getMonthlyRate() , getNumberOfMonth())-1);
        return remainValue;
    }

    public  double[] getlistOfPayment() {
        var balances = new double[getNumberOfMonth()];
        for (int month = 1; month<= getNumberOfMonth(); month++){
            balances[month-1] = calculateRemainMortgage(month);
        }
        return balances;
    }

    private float getMonthlyRate() {            //all the setter and getter method
                                                // should be the lastest methods
        return (annualInterest /percent)/monthInYear;
    }

    private int getNumberOfMonth(){
        return monthInYear * years;
    }

}
