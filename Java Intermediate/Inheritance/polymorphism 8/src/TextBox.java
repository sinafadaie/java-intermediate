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
