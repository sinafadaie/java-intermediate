//when our constructor in base class hase argument
//we should pass the parameter in child class with super()
//if the constructor in base class has overloaded and can execute without argument
//there is no problem, its done automatically

public class TextBox extends UIControl{
    private String text="";

    public TextBox(boolean isEnable) {
        super(true);            //pass the parameter to base class constructor
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
