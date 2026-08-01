//every class directly or indirectly inherits from the object class
//every class we declared have **extends Object** in default
//that is because every class we declared have aditional methods`

public class Main{
    public void main(){
        var obj = new Object();
        obj.hashCode();

        var box1 = new TextBox();
        System.out.println(box1.hashCode());    //calculated base on address of the object on memory
                                                //this is not the address
                                                //the address goes to hash function,and hash function return this numeric value
                                                //this hash number use for compare tow object for equality (witch their address are same)
        var box2 = box1;
        System.out.println(box2.hashCode());    //we know they have same address in heap so same hash number

        System.out.println(box1.equals(box2));  //to compare content ,not the address
                                                //its possible they have same content, but different address

        System.out.println(box1.toString());    //create hash code in hexadecimal
    }
}