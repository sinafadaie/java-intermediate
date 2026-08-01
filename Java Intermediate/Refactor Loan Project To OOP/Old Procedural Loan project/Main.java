import java.util.Scanner;

public class Main {
    final static int monthInYear = 12;      //this variable called feild
    final static int percent =100;          //feild is a variable in a class level

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal=0;
        float rate=0;
        String input;
        byte period=0;

        principal=(int)readNumber("Principal ($1K - $1M): ",1000,1000000);
        rate=(float)readNumber("Annual Interest Rate: ",0,30);
        period=(byte)readNumber("Period (years): ",1,30);

        double mrgage=calculateMortgage(principal,rate,period);
        System.out.println("Mortgage:" + mrgage);

        listOfPayment(period, principal, rate);           //create from extracted method refactor

    }

    private static void listOfPayment(byte period, int principal, float rate) {
        System.out.println("payment lists are below: ");
        for (int month = 1; month<= period *monthInYear; month++){
            System.out.println(calculateRemainMortgage(principal, rate,month, period));
        }
    }

    public static double readNumber(String prompt,double min,double max) {
        Scanner scanner =new Scanner(System.in);
        Float value;
        String input;
        System.out.print(prompt);
        while (true) {
            input = scanner.next();                                                //we should use type that cover all of them
            value = Float.parseFloat((input.replace("٫", ".")));
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years){
        float monthlyRate=(annualInterest/percent)/monthInYear;
        int numberOfMonth=years*monthInYear;
        double mortgage=(principal*monthlyRate*Math.pow(1+monthlyRate,numberOfMonth)) /
                (Math.pow(1+monthlyRate,numberOfMonth)-1);
        return mortgage;
    }


    public static double calculateRemainMortgage(int principal,
                                                 float annualInterest,
                                                 int numberOfPayment,
                                                 byte years){

        float monthlyRate=(annualInterest/percent)/monthInYear;

        double remainValue=principal
                * (Math.pow(1+monthlyRate,years*12)-Math.pow(1+monthlyRate,numberOfPayment))
                /(Math.pow(1+monthlyRate,years*12)-1);

        return remainValue;
    }
}
