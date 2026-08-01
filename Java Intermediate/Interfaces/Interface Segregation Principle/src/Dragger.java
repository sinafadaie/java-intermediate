//we use this class to drag things on the screen

public class Dragger {
    public void drag(Draggable draggable){  //we dont care the object come here ,resizable or not
                                        //can render on it or nor
                                        //we just want to drag it,so we change the input type from UIWidget to Draggable)
        System.out.println("Dragging Done");
    }
}
