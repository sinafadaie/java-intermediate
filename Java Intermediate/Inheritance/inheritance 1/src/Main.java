public class Main{
    public static void main(){
    var control = new UIControl();
    control.disable();
    System.out.println(control.isEnabled());

    var control2 = new TextBox();
    control2.disable();
    System.out.println(control2.isEnabled());
    }
}
