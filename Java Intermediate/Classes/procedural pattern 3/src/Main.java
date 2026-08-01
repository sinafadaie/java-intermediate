//this is a procedural program
//use function or procedures in yor code
//when you want to chane something , you should check all the code
//and changes make always bugs
//you dont have interface
//when you have method or function over 10 parameters
//and you call so many methods or function probably you dont use oop corectlly
// and yor code is just procedural patern

public class Main {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage=calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wage);
    }

    public static  int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary+(extraHours*hourlyRate);
    }
}
