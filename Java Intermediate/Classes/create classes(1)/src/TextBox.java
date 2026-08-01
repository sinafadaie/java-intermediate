//in java each class save in seperate file
public class TextBox {
      public String text="";       //Field
                                   //we should initial it "" to prevent get null

    public void setText(String text){
        this.text=text;                             //use this to say first text refer to Feild
                                                    //this is refrence to current object
    }

    public void clear(){
        text="";
    }
}
