//-------------------------------------Memory allocation
//java has tow memory area
//stack
//heap
//primitive variable,address of objects save in stack
//objects live in heap

//--------------------------------------Memory deallocation
//in java unlike c++ we have no chalenge
//when we exite a method, java run time will automatically
//remove all the variable that stored on stack
//in our program when main method finished,firstBox and secondBox remove from stack
//now we have an object in heap that there is no reference to it
//there is a process in background that watching this objects on the heap
//it is called garbage collection(it is just for heap)
public class Main {

    public static void main(String[] args) {
        TextBox firstBox = new TextBox();       //create memory on heap
        System.out.println(firstBox);           //address of firstBox in heap
        firstBox.setText("hi sina");
        System.out.println(firstBox);           //same address

        var secondBox = firstBox;               //we do not create new object on heap
                                                //just create new variable like firstBox on stack
                                                //and this variable hase the address of our object in heap
        System.out.println(secondBox);          //just tow variable in stack that reference one object in heap

        secondBox.clear();
        System.out.println(firstBox);           //just empty

    }
}
