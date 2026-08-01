//final classes is oposite of abstract classes
//its a leaf,when a class declare final,the other class cant inheritate from it
//we shouldnt use final class that often,because its prevent using inheritance
// ,polymorphism and other oop tools
//when we have so assumptions,and implemention is so specific
//and we want to sure other classes dont extend to it
//-------------------------------
//string class in java is example,its define final'
//string define immutable,once we create an initializer,we cant change it
//if we called method like uppercase,lowercase ---->you get new string
//this is a assumption in this class
//who implemented this class made sure every method modify the string,create new instance
//this is the reason they define string final,
//to prevent extend this class and break this assumption`
public class Main{
    public void main(){
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(var control :controls){
            control.render();
        }
    }
}
