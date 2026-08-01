public class TextBoxOverRide extends UIControl {
    private String text="";

    public TextBoxOverRide(boolean isEnable) {
        super(isEnable);
    }

    @Override
    public String toString() {      //this method come from base object class
        return text;
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
