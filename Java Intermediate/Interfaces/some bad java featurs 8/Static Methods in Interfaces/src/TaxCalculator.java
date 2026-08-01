//we can define static method in interfaces
//its very bad, because interface is not where we implement
//not how, just what
//this feature is caused developed very fat methods in interface!
//-------------------------
//the intention behind this feature is to cover methods that are the same in classes(classes that implement the interface)
//that have same interface(like 2017,2018 getTaxabaleIncome is same method)
//-------------------------
//but there is better way in this situation
//define a abstract class ,and put this logic there
//so we can shared that logic with inhertate
//now we implement it once ,and all related classes have access to it

public interface TaxCalculator {
    public double calculateTax();

  //  static  double getTaxabaleIncome(double income,double expense){     **moved to AbstractTaxCalculator
  //      return income - expense;
  //  }
}

