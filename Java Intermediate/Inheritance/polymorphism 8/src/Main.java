//4 main oop principle
//Encapsulation
//Abstraction
//Inheritance
//Polymorphism (many forms) --->allow objects get different form
//Polymorphism is a kind of encapsulization(because it bundlling data in a single unit)
//every class hase own render method (inside itself)
public class Main{
    public void main(){
        UIControl[] controls = {new TextBox(), new CheckBox()}; //array of UIControl objects
                                                                //in procedural convention to render this array
                                                                //we need a fat if/else statement
                                                                //and each time we add new type,we should change this if
                                                                //instead of this we use polymorphism
                                                                //we declare a method in a UIControl ,and override it in subclasses


        for(var control :controls){                             //control at first loop is Textbox
            control.render();                                   //at second loop is checkbox
        }                                                       //this is polymorphism
    }
}
