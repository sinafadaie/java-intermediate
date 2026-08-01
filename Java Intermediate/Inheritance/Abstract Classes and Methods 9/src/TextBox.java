//if we comment this overriding
//we get error (because UIControl is abstract)
//and this methid is abstract too
public class TextBox extends UIControl {
    private String text="";

    @Override
    public void render() {
        System.out.println("Rendering TextBox");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
