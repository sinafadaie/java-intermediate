//we should use safe refactor
//select method--->refactor----->move members--->create our new class
//this way prevent from compile error

import java.util.Scanner;

public  class Reader {
    static Scanner scanner =new Scanner(System.in);     //to prevent create new object in every use
    //we bring it in class level

    public static float readNumber(String prompt,int min,int max){

        Float value;
        String input;
        System.out.print(prompt);
        while (true) {
            input = scanner.next();
            value = Float.parseFloat((input.replace("٫", ".")));
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }
}
