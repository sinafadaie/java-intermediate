//this fields are final,static,public
//the intention behind this feature is to avoid
//magic numbers(the numbers come from nowhere)
//but they have consicuences
//the field will be constant always? the minimumTax never change?
//if it will change ,we should modify interface, thats very bad things
//so its better we have a final field in our implements(in the class,not in the interface)
//the number is really constant? like pi number
//thats a implementation detail,we dont want to leak to our interface
//-----------------------------------
//thats a bad decision that the java team hade made
//so dont use interface fields ,unless you have strong reason


public interface TaxCalculator {
    float minimumTax = 100;     //all this fields are final(constant)
                                //we cant change them in future
                                //and they are static (its reasonable,in interface you havnt object,
                                // you are in class level )
    public double calculateTax();
}
