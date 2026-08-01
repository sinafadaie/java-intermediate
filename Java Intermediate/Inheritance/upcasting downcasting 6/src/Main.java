//Upcasting is casting an object to one of its super types
//Downcasting is casting an object to one of its sub types
//-----------------------
//textbox object is kind of UIControl object
//but UIControl object is not kind of textbox object
public class Main{
    public void main(){

        var control = new UIControl(true);
        show(control);  //print address of object

        var control2 = new TextBox(true);
        show(control2);                             //its a upcasting(object cast to its parent)
                                                    //because show method get UIControl object
                                                    //but we pass to it a textbox object
                                                    //its worked, because a textbox object is a kind of UIControl object
                                                   //in the other word a textbox object hase all the member of UIControl object (inheritate of it)


        var control3 = new TextBoxOverRide(true);    //when we used over rode textbox class,
        show(control3);                                      //show method return null
                                                             //its because toString method
                                                             //in **System.out.println** using toString method
        control3.setText("hey body");                        //and the text was null,so it returned null
        show(control3);                                      //now you see the string instead of address
        showBetter(control3);
    }

    public static void show(UIControl control){
        System.out.println(control);                  //System.out.println use toString in background
    }

    public static void showBetter(UIControl control){ //show method get UIControl object
        if (control instanceof TextBoxOverRide){      //so in compile time, its just allowed using UIContyol member
            var textbox = (TextBoxOverRide) control;  //but if we pass the Textbox object, we maybe want to use text box members
            textbox.setText("Hello");                 //so we should manually cast object to textbox object,this is called down casting
        }                                             //this if prevent runtime error
                                                      //because if we pass UIControl object and use textbox member
                                                      //its get error(UIControl object is not kind of textbox object,
                                                      // its maybe drop down list or something else!)
        System.out.println(control);
    }
    public static void showAll(Object control){       //all object can pass to this method
                                                      //because Object class is father of all of them
        System.out.println(control);
    }
}
