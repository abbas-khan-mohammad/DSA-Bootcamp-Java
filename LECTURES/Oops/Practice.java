package LECTURES.Oops;
class Pen{
    String color;
    String type; //ballPoint, gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    Pen(String color, String type){
        this.color = color;
        this.type = type;
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){//parametaried constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class Practice{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abbas";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();

        Pen p1 = new Pen("Blue", "Gel");
        p1.printColor();
     }
}