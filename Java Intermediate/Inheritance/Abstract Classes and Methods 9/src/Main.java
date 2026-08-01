//when we create a class that we dont want instantiate it
//we dont want create new instant of that class(it doesnt meaningfull)
//like UIControl, we dont need UIControl object directly,its just a abstract concept
//its the reason we keep render method empty in UIControl class(its a abstract concept)
//we want check box,textbox and ... ,but not the UIControl itself
//in this case we declare the class Abstract,and the class just can be the parent of the other class
public class Main{
    public void main(){
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(var control :controls){
            control.render();
        }
    }
}
