//we want to textbox objects have UIControl methods
//to prevent duplicate code
//we can use inheritance

public class TextBox extends UIControl{  //now UIControl method available
    private String text="";

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
