//if we comment this overriding
//we get error (because UIControl is abstract)
//and this methid is abstract too
public class CheckBox extends UIControl{
    @Override
    public void render() {
        System.out.println("Rendering CheckBox");
    }
}
