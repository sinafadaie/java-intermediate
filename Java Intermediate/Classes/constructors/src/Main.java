//when we initial fields with method
//the client should always handle that before calling method to fill fields
//its not good and simple interface for our class
//so we use constructor to handle this
//--------------------------------------
//default constructor call to create our new object

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();                 //default constructor call here and set all variable to zero
        System.out.println(employee.getBaseSalary());  //before initiale we get 0
        System.out.println(employee.getHourlyRate());  //before initiale we get 0
                                                       //it is because default constructor

        int wage = employee.calculateWage(20);  //its not correct because client forgot initial fields before calling method
        System.out.println(wage);

        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        wage = employee.calculateWage(20);
        System.out.println(wage);

        //---------------------------best practice of oop for this:

        Employee2 employee2 = new Employee2
                (50_000,20);
        System.out.println(employee2.calculateWage(20));    //just have one method
                                                                      //a simple interface

    }

}

