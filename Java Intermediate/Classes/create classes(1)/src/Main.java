

public class Main {

    public static void main(String[] args) {
        TextBox firstBox = new TextBox();    //create new object from TextBox class
        var secondBox = new TextBox();       //because TextBox write twice, this is better syntax

        firstBox.setText("Hello World");
        System.out.println(firstBox.text);  //System.out.println(firstBox);   print firstBox object address on heap

        firstBox.clear();
        System.out.println(firstBox.text);

        System.out.println(secondBox.text);     //get null before we did not initial text in TextBox
        secondBox.text.toUpperCase();           //null is dangerous --->NullPointerException

    }
}
