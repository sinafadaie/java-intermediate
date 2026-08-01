//abstract method doesnt have body (just declaration)
//and subclass have to implete it
public abstract class UIControl {
    private boolean isEnable = true;

    public abstract void render();      //when we declare a abstract method
                                        //all the subclasses should implicit it,otherwise we get error
                                        //if the subclass is abstract to
                                        //then the child of this class responsible to declare this method


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

