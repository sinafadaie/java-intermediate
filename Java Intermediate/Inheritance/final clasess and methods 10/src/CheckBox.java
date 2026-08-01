//when declare a method final
//it can not be overrided in other class
//----------------
//final in method is gray
//because declare a method final in a final class is redundant
public final class CheckBox extends UIControl{
    @Override
    public final void render() {
        System.out.println("Rendering CheckBox");
    }
}
