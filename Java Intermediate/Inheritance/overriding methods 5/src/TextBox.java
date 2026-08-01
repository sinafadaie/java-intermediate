public class TextBox  {
    private String text="";

    public TextBox(String text) {
        this.text = text;
    }

    @Override         //this call an annotation
                      //an annotation is basically  a label we attach to a class member
                      //and with this we give extra information to the java compiler
                      //now we are saing to compiler,we are overriding
                      //with this,compiler check the signature of the method
                      //the methods should have same signature
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
