//when declare a method final
//it can not be overrided in other class
//----------------
//final in method is gray
//because declare a method final in a final class is redundant

public final class TextBox extends UIControl {
    private String text="";

    @Override
    public final void render() {
        System.out.println("Rendering TextBox");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
