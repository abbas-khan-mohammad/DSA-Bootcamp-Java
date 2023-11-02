package LECTURES.Oops;
class calculate{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b, float c){
        return a+b+c;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        calculate c1 = new calculate();
        System.out.println(c1.sum((float)1.3, (float)3.2, (float)7.9));
    }
}
