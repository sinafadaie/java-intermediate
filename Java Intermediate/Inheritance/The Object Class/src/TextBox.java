//extends Object

public class TextBox extends Object{  //extends Object is default
                                      //no matter you write it or not
    private String text="";

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
