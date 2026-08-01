//name convention in interface is not very popular in java
//but some times the name begin with **can** like cancalculatetax
//or some time ...able like dragable or resizable
//---------------------------
//in Interface we dont have state(field)
//just have method declaration (they dont have body,just declaration)
//the answer of what have to be done?

public interface TaxCalculator {
    public double calculateTax();     //public is unnecessary,its redundant
                                      //because interface is the concept to connect the class to the other
                                      //every method in interface should be public
}
