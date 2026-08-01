//use protected access modifier
//--------------------------
//if we dont use anything(public or private or protected)
//its a default and called package modifier
//its public in package and private outside thr package
//and not like protected ,doesnt inhertate!
package com.codewithmosh;

public class UIControl {
    protected boolean isEnable = true;          //use protected

    public UIControl(boolean isEnabled) {
        System.out.println("UIControl");
    }

    public void enable(){
        isEnable = true;
    }

    public void disable(){
        isEnable = false;
    }

    public boolean isEnabled(){
        return isEnable;
    }

}

