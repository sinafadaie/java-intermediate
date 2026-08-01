package com.codewithmosh;

public class TextBox extends UIControl {
    private String text="";

    public TextBox(boolean isEnable) {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text=text;
    }

    public void clear(){
        text="";
    }
}
