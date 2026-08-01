//private members are not inherited by subclasses
//because they are not accessible from outside
//-------------------------
//we have three access modifier(public,private,protected,package modifier)
//protected is not good and we just use public and private
//protected is smelly!
//-------------------------
//protected is like public in package
//as while as in your package you have access to protected member
//but there is a wierd option
//they also accessible by child classes in different packages!
//if Text box define in different package and inhirente from UIControl
//it access to protected member from uicontrol
//so protected members always inheritate!
//--------------------------
//if we dont use anything(public or private or protected)
//its a default and called package modifier
//its public in package and private outside the package
//and not like protected ,doesnt inhertate!

package com.codewithmosh;
import com.codewithmosh.UIControl; //if we in different package we can access to protected member with importing that package
public class Main{
    public void main(){
        boolean enabled = new UIControl(true).isEnabled();
        System.out.println(enabled);
    }
}
