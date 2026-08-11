//in best practice if we override equal method,we should override hash method
//its because hash use address to hash valuse
//and equality and comparing objects use address too
//so if we change equal method
//we should change hash method to get same value(based on content)

public class Main{
    public void main(String[] args){
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1==point2);  //because they are tow different object
                                             //with different address

        System.out.println(point1.equals(point2));  //still we get false
                                                    //because equals method similarly compare two object
                                                    //so we should override it

        System.out.println(point1.hashCode());      //get same hash
        System.out.println(point2.hashCode());      //if we dont override it,we get tow different value(because tow different address)

    }
}
