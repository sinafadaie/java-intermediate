//if all three method being here
//if we want to modify one of them, all the classes using this interface will be effected
//each method is a couple point
//-------------------------
//usually when a interface divided to smaller interface
//the main interface extended to smaller ones to use theirs members(when we use refactor intellij do it automatically)
//------------------------
//in contrast of classes, interfaces can extended to multiple interfaces
//there is no ambiguity
//in classes if we have same method name with same signature, it was possible that their implitation have different
//so it create ambiguity to inheritance
//but in interface there is no body,there is no implitation
//so in this case it inheritate one of them
//-----------------------
//at the ane UIWidget can access to all the method we declared at first
public interface UIWidget{
    //void drag();   shifted to another interface by refactor(extract interface)
    //void resize(); shifted to another interface by refactor
    //
    void render();
}
