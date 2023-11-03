package LECTURES.Oops;
class Shape{
    public void area(){
        System.out.println("area");
    }
}
class Triangle extends Shape{

}
public class Inheritance{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
    }
}