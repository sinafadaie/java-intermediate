public class UIControl {
    private boolean isEnable = true;

    public void render(){
                            //its for polymorphism
                            //we keep it empty here because we dont know what type of object use it now
                            //then we override it in every subclass
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

