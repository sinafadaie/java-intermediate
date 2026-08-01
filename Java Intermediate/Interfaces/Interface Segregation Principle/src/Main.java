//we use interfaces to reduce coupling between classes
//but interfaces themselves are kind of coupling(when a interfaces modified,all classes using it should recompile),
//so we should avoid of fat and complicated interfaces
//this is where interface segregation show up
//divide big interfaces into smaller ones(with this reduce impact of changes)
//-------------------------
//in other hand we can not use a interfaces for every single methods
//its not clean, so there is a trade of
//we should segregate based on **capability **

public class Main {
    public static void Main(){

    }
}
