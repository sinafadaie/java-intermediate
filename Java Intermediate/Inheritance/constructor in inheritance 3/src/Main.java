//in heritance
//constructor in base class will be execute
//so constructor in base class ,and child class must be compatible

public class Main{
    public void main(){
    var box1 = new TextBox(true); //when we havnt constructor in Textbox
                                          //and constructor in UIControl havnt argument
                                          //this print just  **UIControl**
                                          //when we add constructor to textbox
                                          //the constructors should be compatible
                                          //this handle with super()

    }
}