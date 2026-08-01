//there is convention in java
//first we write field
//then write constructor
//then write public method
//then write private method
//then write getter and setter

public class UIControl {
    private boolean isEnable = true;

   /* public UIControl() {
        System.out.println("TextBox");
    }*/

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

