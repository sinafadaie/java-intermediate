import java.util.Objects;

//equals method get Object class, but we want to pass Point class to it
//if we change signature,it will not be a overriding
//it will a different method,with different parameter
//--------------------------------
//in best practice if we override equal method,we should override hash method
//we can use generate to override equal and hash
//its cool
public class Point {
    private int x;
    private int y;

    public Point(int x,int y) {
        this.x=x;
        this.y=y;
    }

    @Override                               //annotation
    public boolean equals(Object obj) {     //use generate intellij to override a method
        if (this == obj){
            return true;                    //check the refrence(same object)
        }
        if (obj instanceof Point){
            var other = (Point)obj;
            return  other.x==x &&
                    other.y==y;
        }
        else return  false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
   /* @Override                            //this come from generate
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    */

}
